<?php 
    // Soal Nomor 11

    $pesan = "Saya arek malang";
    echo strrev($pesan) . "<br>";

    // Soal Nomor 12
    $pesan = "saya arek malang";
    $pesanPerKata = explode(" ", $pesan);

    $pesanPerKata = array_map(fn($pesan) => strrev($pesan), $pesanPerKata);
    $pesan = implode("   
    ", $pesanPerKata);

    echo $pesan . "<br>";