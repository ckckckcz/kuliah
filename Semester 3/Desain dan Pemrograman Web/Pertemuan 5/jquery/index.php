<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Praktikum jQuery</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  </head>
  <body>
    Soal Nomor 1

    <input type="button" id="button1" value="Klik Saya!" />
    <script>
      $(document).ready(function () {
        $("#button1").click(function () {
          alert("Ini praktikum minggu ke-5");
        });
      });
    </script>
  </body>
</html>
