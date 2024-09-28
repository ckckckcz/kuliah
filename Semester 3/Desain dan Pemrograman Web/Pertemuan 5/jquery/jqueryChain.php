<!DOCTYPE html>
<head>
    <title>jquery chain</title>
    <link rel="stylesheet" href="animate.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script>
        $(document).ready(() => {
            $('button').click(() => {
                $('.box')
                    .animate({width : '300px'})
                    .animate({height: '300px'})
                    .animate({marginLeft: '150px'})
                    .animate({borderWidth: '10px'})
                    .animate({opacity: 0.5})
            })
        })
    </script>
</head>
<body>
    <button type="button">Start Animation!</button>
    <div class="box"></div>
</body>
</html>