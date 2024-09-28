<!DOCTYPE html>
<head>
    <title>Slide Up</title>
    <link rel="stylesheet" href="slide.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script>
        $(document).ready(() => {
            $('#flip').click(() => {
                $('#kotak2').slideUp('slow')
            })
        })
    </script>
</head>
<body>
    <div id="flip">Klik untuk efek slide!</div>
    <div id="kotak2">Selamat pagi!</div>
</body>
</html>