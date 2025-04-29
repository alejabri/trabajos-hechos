<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="galeria.css">
    <title>Document</title>
</head>
<body>
    <?php

    echo "<h1>".$_POST['titulo']."</h1>";

    if(isset($_POST['subir'])) {
        if(is_uploaded_file($_FILES['foto']['tmp_name'][0])){
            $cantidad=count($_FILES['foto']['name']);
            for ($i=0; $i < $cantidad; $i++) { 
                move_uploaded_file($_FILES['foto']['tmp_name'][$i],'imagenes/'.$i.'.jpg');//? print("imagen ".$i." subido, "): print("error ");
    
                echo '<div><img src= "imagenes/'.$i.'.jpg"></div>';
            }
            
        }
    
    }
    ?>
</body>
</html>