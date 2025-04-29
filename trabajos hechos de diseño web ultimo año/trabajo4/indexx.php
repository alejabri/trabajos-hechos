<?php
phpinfo();
function redimensionarImg($imagen, $medidaFinal){

    //Paso 1: obtener atributo de la imagen
    list($anchoOrig, $altoOrig, $nroTipo) = getimagesize($imagen);
    //paso 2: crear variable segun el tipo
    switch ($nroTipo) {
        case 2:
            $imgOriginal= imagecreatefromjpeg($imagen);
            break;
        case 3:
            $imgOriginal=imagecreatefrompng($imagen);
            break;
        default:
            break;
    }
    //Paso 3: calcular dimension faltante
    $aspecto = $anchoOrig / $altoOrig;

    if ($altoOrig > $anchoOrig ) {
        //vertical => medidaFinal=alto_final ??? incognita ancho_final
        $altoFinal=$medidaFinal;
        $anchoFinal = $altoFinal * $aspecto;
    }else if($anchoOrig > $altoOrig){
        //horizontal=> medidaFinal=ancho_final ??? incognita alto_final            
        $anchoFinal = $medidaFinal;
        $altoFinal = $anchoFinal / $aspecto;
    }

    //Paso 4: Creamos el lienzo blanco para la nueva imagen
    $nuevaImg = imageCreateTrueColor($anchoFinal, $altoFinal);
    
    //Paso 5: pegar imagen en lienzo
    imagecopyresampled($nuevaImg, $imgOriginal, 0 , 0 , 0 , 0 , $anchoFinal, $altoFinal, $anchoOrig, $altoOrig);    
    //Paso 6: eliminar original
    imagedestroy($imgOriginal);
    //Paso 7: Determinar calidad imagen
        $calidad=70;
    //Paso 8: Nombre del archivo final
    $nombreImagen = time().'_'.$imagen;
    //Paso 9: Guardamos la nueva imagen en la carpeta imagenes
    imagejpeg($nuevaImg, "imagenes/".$nombreImagen, $calidad);
    //Paso 10: retorno el nombre de nueva imagen
    return $nombreImagen;
}
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<!-- <img src="vert.png" alt=""> -->
<form method="post" enctype="multipart/form-data">
    <label for="imagen">Ingrese su imagen</label>
    <input type="file" name="imagen" id="imagen" accept="image/*">
    <label for="calidad">Ingrese la dimension que desea para su imagen</label>
    <input type="number" name="medida" id="calidad">
    <input type="submit" name="subir" value="Subir">
</form>
    <?php
    if(isset($_POST["subir"])){
        if(is_uploaded_file($_FILES['imagen']['tmp_name'])){
            move_uploaded_file($_FILES["imagen"]["tmp_name"],$_FILES["imagen"]["name"]);
        }        
        $medidaFinal=$_POST['medida'];

    $imagen = $_FILES["imagen"]["name"];

    $imagenNew=redimensionarImg($imagen, $medidaFinal);
    echo '<img src="imagenes/'.$imagenNew.'">';
    
    }

    ?>
</body>
</html>