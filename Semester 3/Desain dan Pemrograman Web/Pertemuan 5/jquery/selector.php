<!DOCTYPE html>
  <head>
    <title>Selector</title>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script>
        $(document).ready(function() {
            $("button").click(function() {
                $("h2").hide();
                $(".subjudul").hide();
                $("#paragraf").hide();
                $("#paragraf.dua").hide();
                $("div p.paragraf").hide();
            });
        });
    </script>
  </head>
  <body>
    <h2>Ini adalah judul bab</h2>
    <h3 class = "subjudul">Ini adalah sub judul bab</h3>
    <p id="paragraf" class="dua">Ini adalah paragraf kedua</p>
    <div>
        <p class="paragraf">
            Ini adalah paragraf ketiga
        </p>
    </div>
    <p>Ini paragraf yang akan tetap ditampilkan</p>
    <button>Klik saya!</button>
  </body>
</html>