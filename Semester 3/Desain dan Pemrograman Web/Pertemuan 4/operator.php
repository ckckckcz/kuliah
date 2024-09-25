<?php
    $a = 10;
    $b = 5;

    $hasilTambah = $a + $b;
    $hasilKurang = $a - $b;
    $hasilKali = $a * $b;
    $hasilBagi = $a / $b;
    $sisaBagi = $a % $b;
    $pangkat = $a ** $b;

    //Soal 3.1
    echo "Hasil dari $a ditambah $b adalah $hasilTambah <br>";
    echo "Hasil dari $a dikurangi $b adalah $hasilKurang <br>";
    echo "Hasil dari $a dikali $b adalah $hasilKali <br>";
    echo "Hasil dari $a dibagi $b adalah $hasilBagi <br>";
    echo "Hasil dari $a sisa bagi $b adalah $sisaBagi <br>";
    echo "Hasil dari $a pangkat $b adalah $pangkat <br>";

    $hasilSama = $a == $b;
    $hasilTidakSama = $a != $b;
    $hasilLebihKecil = $a < $b;
    $hasilLebihBesar = $a > $b;
    $hasilLebihKecilSama = $a <= $b;
    $hasilLebihBesarSama = $a >= $b;

    //Soal 3.2
    echo "<br>";
    echo "Hasil perbandingan $a sama dengan $b : " . ($hasilSama ? 'true' : 'false') . "<br>";
    echo "Hasil perbandingan $a tidak sama dengan $b : " . ($hasilTidakSama ? 'true' : 'false') . "<br>";
    echo "Hasil perbandingan $a lebih kecil dari $b : " . ($hasilLebihKecil ? 'true' : 'false') . "<br>";
    echo "Hasil perbandingan $a lebih besar dari $b : " . ($hasilLebihBesar ? 'true' : 'false') . "<br>";
    echo "Hasil perbandingan $a lebih kecil dari atau sama dengan $b : " . ($hasilLebihKecilSama ? 'true' : 'false') . "<br>";
    echo "Hasil perbandingan $a lebih besar dari atau sama dengan $b : " . ($hasilLebihBesarSama ? 'true' : 'false') . "<br>";

    $hasilAnd = $a && $b;
    $hasilOr = $a || $b;
    $hasilNotA = !$a;
    $hasilNotB = !$b;
    
    //Soal 3.3
    echo "<br>";
    echo "Hasil operator logika $a AND $b : " . ($hasilAnd ? 'true' : 'false') . "<br>";
    echo "Hasil operator logika $a OR $b : " . ($hasilOr ? 'true' : 'false') . "<br>";
    echo "Hasil operator logika NOT $a : " . ($hasilNotA ? 'true' : 'false') . "<br>";
    echo "Hasil operator logika NOT $b : " . ($hasilNotB ? 'true' : 'false') . "<br>";

    //Soal 3.4
    echo "<br>";
    echo "Nilai variabel a($a) setelah dijumlah dengan $b adalah " . $a+=$b;
    echo "<br>";
    echo "Nilai variabel a($a) setelah dikurangi dengan $b adalah " . $a-=$b;
    echo "<br>";
    echo "Nilai variabel a($a) setelah dikali dengan $b adalah " . $a*=$b;
    echo "<br>";
    echo "Nilai variabel a($a) setelah dibagi dengan $b adalah " . $a/=$b;
    echo "<br>";
    echo "Nilai variabel a($a) setelah disisa bagi dengan $b adalah " . $a%=$b;
    echo "<br>";

    $hasilIndentik = $a === $b;
    $hasilTidakIdentik = $a !== $b;

    //Soal 3.5
    echo "<br>";
    echo "Hasil perbandingan $a Identik (nilai dan tipe data sama) dengan $b : " . ($hasilIndentik ? 'true' : 'false') . "<br>";
    echo "Hasil perbandingan $a Tidak Identik (nilai atau tipe data tidak sama) dengan $b : " . ($hasilTidakIdentik ? 'true' : 'false') . "<br>";

    //Soal 3.6
    $jumlahKursi = 45;
    $jumlahKursiTersedia = $jumlahKursi - 28;
    $persentasiJumlahKursiTersedia = intval($jumlahKursiTersedia / 45 * 100);

    echo "<br>";
    echo "Kursi yang masih kosong pada restoran tersebut sebanyak $persentasiJumlahKursiTersedia persen";
?>