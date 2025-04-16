<form action="{{ url('profile/update_picture') }}" method="POST" id="profile-picture-form" enctype="multipart/form-data"
    data-profile-form>
    @method('PUT')
    @csrf
    <div id="modal-master" class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="modal-title">Update Profile Picture</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="text-center mb-3">
                    <div class="profile-preview-container">
                        <img id="profile-preview"
                            src="{{ $user->picture_url ? asset('storage/' . $user->picture_url) : 'adminlte/dist/img/user4-128x128.jpg' }}"
                            alt="Profile Preview" class="rounded-circle mb-3"
                            style="width: 150px; height: 150px; object-fit: cover;">
                    </div>
                    <p class="text-muted small">Preview of your new profile picture</p>
                </div>

                <div class="form-group">
                    <label for="profile_picture" class="d-block">Select Image</label>
                    <input type="file" name="profile_picture" id="profile_picture" class="form-control"
                        accept="image/jpeg,image/png,image/jpg" required>
                    <small class="form-text text-muted">Recommended size: 400x400 pixels. Max size: 2MB.</small>
                    <small id="error-profile_picture" class="error-text form-text text-danger"></small>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-light" data-dismiss="modal">Cancel</button>
                <button type="submit" class="btn btn-primary">Save Profile Picture</button>
            </div>
        </div>
    </div>
</form>

<script>
    $(document).ready(function() {
        $.validator.addMethod('filesize', function(value, element, param) {
            return this.optional(element) || (element.files[0].size <= param);
        }, 'File size must be less than {0} bytes.');

        $("#profile-picture-form").validate({
            rules: {
                profile_picture: {
                    required: true,
                    extension: "jpg,jpeg,png",
                    filesize: 2 * 1024 * 1024 // 2MB
                },
            },

            submitHandler: function(form) {
                var formData = new FormData(form);
                const defaultImage =
                    "{{ auth()->user()->profile_picture ?? 'adminlte/dist/img/user4-128x128.jpg' }}";

                $.ajax({
                    url: form.action,
                    type: form.method,
                    data: formData, // Send data as FormData
                    processData: false, // Prevent jQuery from processing the data
                    contentType: false, // Prevent jQuery from setting content type
                    success: function(response) {
                        if (response.status) { // If successful
                            $('#myModal').modal('hide');
                            Swal.fire({
                                icon: 'success',
                                title: 'Berhasil',
                                text: response.message,
                            }).then((result) => {
                                if (result.isConfirmed) {
                                    location
                                        .reload(); // Reload the page to reflect changes
                                }
                            });
                            $('#profile-preview').attr('src', defaultImage);
                        } else { // If error
                            $('.error-text').text('');
                            $.each(response.msgField, function(prefix, val) {
                                $('#error-' + prefix).text(val[0]);
                            });
                            Swal.fire({
                                icon: 'error',
                                title: 'Terjadi Kesalahan',
                                text: response.message
                            });
                        }
                    },
                    error: function(xhr, status, error) {
                        Swal.fire({
                            icon: 'error',
                            title: 'Error',
                            text: 'An error occurred while uploading the image. Please try again.'
                        });
                    }
                });
            }
        });

        $('#profile_picture').on('change', function() {
            const file = this.files[0];
            if (file && file.type.startsWith('image/')) {
                const reader = new FileReader();
                reader.onload = function(e) {
                    $('#profile-preview').attr('src', e.target.result);
                };
                reader.readAsDataURL(file);
            } else {
                Swal.fire({
                    icon: 'error',
                    title: 'Invalid File',
                    text: 'Please select a valid image file (JPG, JPEG, PNG).'
                });
                $(this).val('');
                $('#profile-preview').attr('src', defaultImage);
            }
        });
    });
</script>
