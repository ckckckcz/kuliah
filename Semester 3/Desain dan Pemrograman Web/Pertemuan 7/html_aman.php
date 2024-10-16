<?php

$_POST = array("input" => "<script>alert('Alamak kena inject!')</script>", "email" => "riovld@gmail.com");

$input = $_POST['input'];
$input = htmlspecialchars($input, ENT_QUOTES, 'UTF-8');
echo $input;
echo "<br><br>";

$email = $_POST['email'];
if (filter_var($email, FILTER_VALIDATE_EMAIL)) {
    echo "Email valid {$email}";
} else {
    echo "Email tidak valid";
}