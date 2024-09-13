document.getElementById("myForm").addEventListener("submit", function (event) {
  event.preventDefault();

  const checkBox = document.getElementById("checkForm");
  if (checkBox.checked) {
    alert("Yakin form yang ingin anda kirim sudah dicek ???");
    window.location.reload();
    return;
  }

  const nama = document.getElementById("inputName").value.trim();
  const alamat = document.getElementById("inputAddress").value.trim();
  const tanggalLahir = document.getElementById("inputDate").value.trim();

  let valid = true;

  if (nama === "") {
    alert("Nama tidak boleh kosong");
    valid = false;
  }

  if (alamat === "") {
    alert("Alamat tidak boleh kosong");
    valid = false;
  }

  if (tanggalLahir === "") {
    alert("Tanggal lahir tidak boleh kosong");
    valid = false;
  }

  if (valid) {
    if (confirm("Form berhasil dikirim!")) {
      window.location.reload();
    }
  }
});
