<!DOCTYPE html>
<head>
    <title>ajax main</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script>
        $(document).ready(() => {
            $('button').click(() => {
                $('#box').load('pageAjax.php')
            })
        })
    </script>
</head>
<body>
    <div id="box">
        <h2>Klik tombol di bawah untuk menampilkan konten</h2>
    </div>
    <button type="button">Klik saya!</button>
</body>
</html>