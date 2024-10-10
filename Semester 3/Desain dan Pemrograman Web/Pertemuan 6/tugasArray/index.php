<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="global.css" />
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous" />
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <title>Menampilkan Data Siswa</title>
</head>

<body class="p-5">
  <h1 class="text-center">Data Siswa</h1>
  <div class="click mt-5 bg-primary border border-black border-2">
    <div class="text-center p-1 bg-primary border-bottom border-black border-2" id="flip">
      <h4 class="text-white mt-2">Click Untuk Melihat Data</h4>
    </div>
    <div class="table-container p-5" id="panel">
      <table class="table caption-top text-center table-bordered">
        <thead>
          <tr>
            <th scope="col" class="table-light">No</th>
            <th scope="col" class="table-light">Nama</th>
            <th scope="col" class="table-light">Umur</th>
            <th scope="col" class="table-light">Kelas</th>
            <th scope="col" class="table-light">Prodi</th>
          </tr>
        </thead>
        <tbody>
          <?php
          include 'data.php';

          $no = 1;
          $totalUmur = 0;
          $jumlahSiswa = count($dataSiswa);
          foreach ($dataSiswa as $siswa) {
            echo "<tr>";
            echo "<th scope='row' class='tableBody'>" . $no++ . "</th>";
            echo "<td class='tableBody'>" . $siswa['nama'] . "</td>";
            echo "<td class='tableBody'>" . $siswa['umur'] . "</td>";
            echo "<td class='tableBody'>" . $siswa['kelas'] . "</td>";
            echo "<td class='tableBody'>" . $siswa['prodi'] . "</td>";
            echo "</tr>";

            $totalUmur += $siswa['umur'];
          }

          if ($jumlahSiswa > 0) {
            $rataRataUmur = $totalUmur / $jumlahSiswa;
            $rataRataUmur = number_format($rataRataUmur, 2);
          } else {
            $rataRataUmur = 0;
          }
          ?>
        </tbody>
      </table>
    </div>
    <h3 class="text-center mt-2 mb-5 text-white ">Rata-Rata Umur Siswa : <?php echo $rataRataUmur; ?> Tahun</h3>
  </div>
  <script src="App.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
    crossorigin="anonymous"></script>
</body>

</html>