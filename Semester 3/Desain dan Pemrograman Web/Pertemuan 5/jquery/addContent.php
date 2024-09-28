<!DOCTYPE html>
<head>
    <title>Praktikum JQuery</title>
    <link rel="stylesheet" href="table.css">
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script>
        $(document).ready(function(){
            // add baris
            $("#add-row").click(function(){
                var name = $("#name").val();
                var email = $("#email").val();
                var markup = "<tr><td><input type='checkbox' name='record'></td><td>" 
                + name + "</td><td>" 
                + email + "</td></tr>";
                $("table tbody").append(markup);

                $("#name").val('');
                $("#email").val('');
            })

            // delete baris yg dicentang
            $(".delete-row").click(function(){
                $("table tbody").find('input[name="record"]').each(function(){
                    if($(this).is(":checked")){
                        $(this).parents("tr").remove();
                    }
                })
            })
        })
    </script>
</head>
<body>
    <form>
        <input type="text" id="name" placeholder="Name">
        <input type="text" id="email" placeholder="Email Address">
        <input type="button" id="add-row" value="Add Row">
    </form>
    <table>
        <thead>
            <th>Select</th>
            <th>Name</th>
            <th>Email</th>
        </thead>
        <tbody>
            <tr>
                <td><input type="checkbox" name="record"></td>
                <td>Riovaldo Alfiyan Fahmi Rahman</td>
                <td>riovaldo@gmail.com</td>
            </tr>
        </tbody>
    </table>
    <button type="button" class="delete-row">Delete Row</button>
</body>
</html>