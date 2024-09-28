<?php
//Soal nomor 6

// function tampilkanHaloDunia(){
//     echo "Halo Dunia <br/>";

//     tampilkanHaloDunia();
// }

// tampilkanHaloDunia();

//Soal nomor 6

// function tampilkanAngka (int $jumlah, int $indeks = 1){
//     echo "Perulangan ke-{$indeks} <br/>";

//     if ($indeks < $jumlah){
//         tampilkanAngka($jumlah, $indeks + 1);
//     }
// }
// tampilkanAngka(20);

//Soal nomor 7

// $menu = [
//     ["nama" => "Beranda"],
//     ["nama" => "Berita",
//      "subMenu" => [
//          ["nama" => "Wisata",
//           "subMenu" => [
//               ["nama" => "Pantai"],
//               ["nama" => "Gunung"]
//           ]
//          ],
//          ["nama" => "Kuliner"],
//          ["nama" => "Hiburan"]
//      ]
//     ],
//     ["nama" => "Tentang"],
//     ["nama" => "Kontak"]
// ];

// function tampilkanMenuBertingkat(array $menu){
//     echo "<ul>";
//     foreach ($menu as $key => $item) {
//         echo "<li>{$item['nama']}</li>";
//     }
//     echo "</ul>";
// }

// tampilkanMenuBertingkat($menu);


//Soal nomor 8

$menu = [
    ["nama" => "Beranda"],
    ["nama" => "Berita",
     "subMenu" => [
         ["nama" => "Wisata",
          "subMenu" => [
              ["nama" => "Pantai"],
              ["nama" => "Gunung"]
          ]
         ],
         ["nama" => "Kuliner"],
         ["nama" => "Hiburan"]
     ]
    ],
    ["nama" => "Tentang"],
    ["nama" => "Kontak"]
];

function tampilkanMenuBertingkat(array $menu) {
    echo "<ul>";
    foreach ($menu as $item) {
        echo "<li>{$item['nama']}</li>";
        if (isset($item['subMenu'])) {
            tampilkanMenuBertingkat($item['subMenu']);
        }
    }
    echo "</ul>";
}

tampilkanMenuBertingkat($menu);

