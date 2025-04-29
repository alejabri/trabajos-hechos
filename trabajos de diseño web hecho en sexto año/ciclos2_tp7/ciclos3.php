<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="ciclos3.css">
    <title>Document</title>
</head>
<body>

    <?php
    if(isset($_GET['generar'])) {
        $op1=$_GET['op1'];
        $opcion=$_GET['opcion'];

        switch($opcion) {

            case 'ordenada': echo '<ul>';
            echo '<h1>Lista Ordenada</h1>';
            for($x=1;$x<=$op1;$x++) {            
                echo '<li>'.$_GET['name'.$x].'</li>';
            }
            echo '</ul>';
            break;

            case 'numerada': echo '<ol>';
            echo '<h1>Lista Numerada</h1>';
            for($x=1;$x<=$op1;$x++) {            
                echo '<li>'.$_GET['name'.$x].'</li>';
            }
            echo '</ol>';
            break;

            default: echo 'opcion invalida';
            break;
        }

    }

    ?>
</body>
</html>