<!DOCTYPE html>
<html lang="id">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="array2.css">
        <title>Data Dosen</title>
    </head>
    <body>
        <h1>Informasi Dosen</h1>
        <table>
            <tr>
                <th>Nama</th>
                <th>Domisili</th>
                <th>Jenis Kelamin</th>
            </tr>
            <tr>
                <?php
                $Dosen = [
                    'nama' => 'Elok Nur Hamdana',
                    'domisili' => 'Malang',
                    'jenis_kelamin' => 'Perempuan'
                ];
                ?>
                <td><?php echo $Dosen['nama']; ?></td>
                <td><?php echo $Dosen['domisili']; ?></td>
                <td><?php echo $Dosen['jenis_kelamin']; ?></td>
            </tr>
        </table>
    </body>
</html>
