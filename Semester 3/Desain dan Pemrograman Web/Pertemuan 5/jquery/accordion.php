<!DOCTYPE html>
<head>
    <title>accordion</title>
    <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
    <script>
        $(function () {
            $("#accordion").accordion();
        });
    </script>
</head>
<body>
    <div id="accordion">
        <h3>Header 1</h3>
        <p>This is section 1. Place your content here in paragrahps or use div elements etc.</p>
        <h3>Header 2</h3>
        <p>This is section 2. You can also include images like this:
            <br> <img src="./img/img.webp">
        </p>
        <h3>Header 3</h3>
        <div>
            <p>This is section 3. Content can include listing as well</p>
            <ol>
                <li>Item 1</li>
                <li>Item 2</li>
                <li>Item 3</li>
                <li>Item 4</li>
            </ol>
        </div>
    </div>
</body>
</html>