<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $jumlahField = intval($_POST['jumlahField']);

    if ($jumlahField > 0) {
        echo '<h3>Daftar Form</h3>';
        echo '<form class="mt-4">';
        for ($i = 1; $i <= $jumlahField; $i++) {
            if ($i % 2 != 0) {
                echo '<div class="row mb-3">';
            }

            echo '
            <div class="col">
              <label for="field' . $i . '" class="form-label">Form ' . $i . '</label>
              <input type="text" class="form-control" id="field' . $i . '" name="field' . $i . '">
            </div>
            ';
            if ($i % 2 == 0 || $i == $jumlahField) {
                echo '</div>';
            }
        }

        echo '<button type="submit" class="btn btn-primary">Submit</button>';
        echo '</form>';
    }
}
?>