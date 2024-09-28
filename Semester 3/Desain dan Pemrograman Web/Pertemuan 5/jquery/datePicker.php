<!DOCTYPE html>
<head>
    <title>datepicker</title>
    <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
    <script>
        $(function () {
            $('#date').datepicker();
        });
    </script>
</head>

<body>
    <div>Selected date: <input type="text" id="date"> </div>
</body>

</html>