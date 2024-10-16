<?php
// part 1
// $pattern = '/[a-z]/';
// $text = 'This is a Sample Text.';

// if (preg_match($pattern, $text)) {
//     echo "Huruf kecil ditemukan!";
// } else {
//     echo "Tidak ada huruf kecil!";
// }

// echo "<br><br>";

// part 2
// $pattern = '/[0-9]+/'; // Cocokkan satu atau lebih digit
// $text = 'There are 123 apples.';
// if (preg_match($pattern, $text, $matches)) {
//     echo "Cocokkan : " . $matches[0];
// } else {
//     echo "Tidak ada yang cocok!";
// }

// echo "<br><br>";

// part 3
// $pattern = '/apple/';
// $replacement = 'banana';
// $text = 'I like apple pie.';
// $new_text = preg_replace($pattern, $replacement, $text);
// echo $new_text;

// echo "<br><br>";

// part 4
// $pattern = '/go*d/';
// $text = 'god is good.';
// if (preg_match($pattern, $text, $matches)) {
//     echo "Cocokkan : " . $matches[0];
// } else {
//     echo "Tidak ada yang cocok!";
// }

// echo "<br><br>";

// soal 1
// $pattern = '/go?d/';
// $text = 'god is good.';
// if (preg_match($pattern, $text, $matches)) {
//     echo "Cocokkan : " . $matches[0];
// } else {
//     echo "Tidak ada yang cocok!";
// }

// echo "<br><br>";

// part 2
$pattern = '/go{2,5}d/';
$text = 'god is good.';
if (preg_match($pattern, $text, $matches)) {
    echo "Cocokkan : " . $matches[0];
} else {
    echo "Tidak ada yang cocok!";
}