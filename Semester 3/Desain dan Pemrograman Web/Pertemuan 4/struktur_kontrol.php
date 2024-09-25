<?php 
$nilaiNumerik = 92;

if ($nilaiNumerik >= 90 && $nilaiNumerik <= 100) {
    echo "Nilai huruf: A";
} elseif ($nilaiNumerik >= 80 && $nilaiNumerik < 90) {
    echo "Nilai huruf: B";
} elseif ($nilaiNumerik >= 70 && $nilaiNumerik < 80) {
    echo "Nilai huruf: C";
} elseif ($nilaiNumerik < 70) {
    echo "Nilai huruf: D";
}

$jarakSaatIni = 0;
$jarakTarget = 500;
$peningkatanHarian = 30;
$hari = 0;

while ($jarakSaatIni < $jarakTarget) {
    $jarakSaatIni += $peningkatanHarian;
    $hari++;
}

echo "<br>";
echo "Atlet tersebut memerlukan $hari hari untuk mencapai jarak 500 kilometer.";

$jumlahLahan = 10;
$tanamanPerLahan = 5;
$buahPerTanaman = 10;
$jumlahBuah = 0;

for ($i = 1; $i <= $jumlahLahan; $i++) { 
    $jumlahBuah += ($tanamanPerLahan * $buahPerTanaman);
}

echo "<br><br>";
echo "Jumlah buah yang akan dipanen adalah: $jumlahBuah";

$skorUjian = [85, 92, 78, 96, 88];
$totalSkor = 0;

foreach ($skorUjian as $skor) {
    $totalSkor += $skor;
}

echo "<br><br>";
echo "Total skor ujian adalah: $totalSkor";

$nilaiSiswa = [85, 92, 58, 64, 90, 55, 88, 79, 70, 96];

echo "<br><br>";
foreach ($nilaiSiswa as $nilai) {
    if ($nilai < 60) {
        echo "Nilai: $nilai (Tidak lulus) <br>";
        continue;
    }
    echo "Nilai: $nilai (Lulus) <br>";
}

// Soal cerita 1
$nilaiUjian = [85, 92, 78, 64, 90, 75, 88, 79, 70, 96];

sort($nilaiUjian);
array_shift($nilaiUjian); 
array_shift($nilaiUjian);
array_pop($nilaiUjian);
array_pop($nilaiUjian);

$totalNilai = 0;
foreach ($nilaiUjian as $nilaiMTK) {
    $totalNilai += $nilaiMTK;
}

echo "<br><br>";
echo "Total nilai ujian matematika setelah mengabaikan 2 nilai tertinggi dan 2 nilai terendah: $totalNilai <br>";
echo "Rata-rata nilai ujian matematika setelah mengabaikan 2 nilai tertinggi dan 2 nilai terendah: " . $totalNilai/6;

// Soal cerita 2
$harga = 120000;
$diskon = 0;
if ($harga > 100000) {
    $diskon = 20;
}

$hargaAkhir = $harga - ($harga * $diskon/100);

echo "<br><br>";
echo "Harga yang harus dibayar: $hargaAkhir"; 

// Soal cerita 3
$poin = 600;

echo "<br><br>";
echo "Total skor pemain : $poin <br>";
echo "Apakah pemain mendapatkan hadiah tambahan? " . ($poin > 500 ? 'YA' : 'TIDAK');
?>