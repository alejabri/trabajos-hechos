<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Slider de imagenes con puro CSS - MagtimusPro</title>
    <link rel="stylesheet" href="estilos.css">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
</head>

<body>
    <?php
        $titulo=$_POST['titulo'];

        echo '<h1>'.$titulo.'</h1>'; 
    ?>

    <div class="contenedor">

        <input type="radio" id="1" name="image-slide" hidden/>
        <input type="radio" id="2" name="image-slide" hidden/>
        <input type="radio" id="3" name="image-slide" hidden/>

        <div class="slide">

            <!-- <div class="imagen">
                <img src="Images/img1.jpg">
            </div>

            <div class="imagen">
                <img src="Images/img2.jpg">
            </div>

            <div class="imagen">
                <img src="Images/img3.jpg">
            </div> -->
 
        
        
    

<?php
 if(isset($_POST['subir'])) {
    include("redimensionarImg.php");

     for($i=1; $i<=3; $i++){

        if(is_uploaded_file($_FILES['foto'.$i.'']['tmp_name'])){
            $archivo = $_FILES['foto'.$i.'']['name'];

            move_uploaded_file($_FILES['foto'.$i.'']['tmp_name'], $archivo);

            $nbr_img = redimensionarImg($archivo,3440,1440);

            echo '<div class="imagen"><img src="imagenes/'.$nbr_img.'"></div>';

            unlink($archivo);
        }

     }

}
 ?>

</div>

    </div>

</body>

</html>
