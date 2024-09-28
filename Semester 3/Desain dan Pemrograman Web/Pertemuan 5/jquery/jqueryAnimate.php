<!DOCTYPE html>
<head>
    <title>jquery animate</title>
    <link rel="stylesheet" href="animate.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script>
        $(document).ready(() => {
            $('button').click(() => {
                $('div').animate({left: 300})
            })
        })
    </script>
</head>
<body>
    <button>Start Animation</button>
    <div class="box"></div>
</body>
</html>