<!DOCTYPE HTML>
<html>

<head>
</head>

<body>
    <form method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>">
        Name: <input type="text" name="fname">
        <input type="submit">
    </form>
    <?php
    $name = "";

    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $name = $_POST["fname"];
        if (empty($name)) {
            echo "Nama kosong";
        } else {
            echo $name;
        }
    }
    ?>
</body>

</html>