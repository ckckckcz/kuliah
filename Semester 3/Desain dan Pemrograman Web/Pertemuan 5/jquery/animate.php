<!DOCTYPE html>
<head>
    <title>Animate</title>
    <link rel="stylesheet" href="animate.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script>
        $(document).ready(function(){
            $("button").click(function(){
                $("div").animate({
                    left: 300
                });
            });
        });
    </script>
</head>
<body>
    <button type="button">Start Animation</button>
    <div class="box"></div>
</body>
</html>