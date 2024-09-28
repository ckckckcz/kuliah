<!DOCTYPE html>
<head>
    <title>Slide Show</title>
    <link rel="stylesheet" href="slideshow.css">
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script>
      var i = 0;

      $(document).ready(function(){
          $('.slidetitle, #slider img').hide();
          showNextImage();
          setInterval('showNextImage()', 3000);
      });

      function showNextImage(){
          i++;
          $('#sliderImage' + i).appendTo('#slider').fadeIn(1100).delay(1100).fadeOut(1100);
          $('#title' + i).appendTo('#slider').fadeIn(1100).delay(1100).fadeOut(1100);
          if (i == 3) {
            i = 0;
          }
      }
    </script>
</head>
<body>
    <div id="slider">
        <img id="sliderImage1" src="img/img.webp">
        <div class="slidertitle" id="title1">Gambar 1</div>

        <img id="sliderImage2" src="img/img1.jpg">
        <div class="slidertitle" id="title1">Gambar 2</div>

        <img id="sliderImage3" src="img/img2.jpg">
        <div class="slidertitle" id="title3">Gambar 3</div>
    </div>
</body>
</html>