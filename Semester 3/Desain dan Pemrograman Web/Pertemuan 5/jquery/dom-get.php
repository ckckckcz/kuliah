<!DOCTYPE html>
<head>
    <title>DOM</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script>
        $(document).ready(function(){
            $("#btn1").click(function(){
                alert($("#test1").text());
            });
            $("#btn2").click(function(){
                alert($("#test2").html());
            });
            $("#btn3").click(function(){
                alert($("#test3").val());
            });
        });
    </script>
</head>
<body>
    <p id="test1">This is the first paragraph</p>
    <p id="test2">This is <b>another</b> paragraph</p>
    <p>Your name: </p>
    <input type="text" id="test3">

    <button id="btn1">Get Text</button>
    <button id="btn2">Get HTML</button>
    <button id="btn3">Get Value</button>
</body>
</html>