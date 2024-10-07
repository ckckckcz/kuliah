<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Document</title>
</head>

<body>
  <!-- Cara 01 -->
  <p>Tanggal hari ini : <?php echo date("d M Y") ?></p>
  <!-- Cara 02 -->
  <?php
  echo '<html>';
  echo '<head><title>Cara02</title></head>';
  echo '<body>';
  echo '<p>Tanggal Hari ini : ' . date('d M Y') . '</p>';
  echo '</body>';
  echo '</html>';
  ?>
</body>

</html>