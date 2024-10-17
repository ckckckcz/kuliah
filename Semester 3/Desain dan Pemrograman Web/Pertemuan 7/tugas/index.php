<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Dynamic Form</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
  <div class="container mt-5">
    <div class="mb-3 row g-2">
      <div class="col-auto">
        <label for="jumlahField" class="form-label">Masukkan Jumlah Field</label>
        <input type="number" id="jumlahField" name="jumlahField" class="form-control" min="1">
      </div>
      <div class="col-auto align-self-end">
        <button type="button" id="generateForm" class="btn btn-primary">Generate</button>
      </div>
    </div>
    <hr>

    <div id="dynamicFormContainer" class="bg-body-tertiary rounded-3 p-5">
      <h3>Daftar Form</h3>
    </div>
  </div>
  <script src="app.js"></script>
</body>

</html>