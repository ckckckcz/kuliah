<!DOCTYPE html>
<head>
    <title>Events</title>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <style>
        #paragraf{
            width: 600px;
            height: 80px;
            background-color: blue;
            line-height: 80px;
            text-align: center;
            font-size: 30px;
        }
    </style>
    <script>
        $(document).ready(function(){
            $("#paragraf").click(function() {
                $("#paragraf").css("color","white");
            });
            $("#paragraf").mouseover(function() {
                $("#paragraf").css("background-color","silver");
            });
            $("#paragraf").mouseout(function() {
                $("#paragraf").css("background-color","white");
            });
            $("#paragraf").dblclick(function() {
                $("#paragraf").css("border","solid 3px black");
            });
            
        })
    </script>
</head>
<body>
    <p id="paragraf">Praktikum Minggu ke-5 JQuery</p>
</body>
</html>