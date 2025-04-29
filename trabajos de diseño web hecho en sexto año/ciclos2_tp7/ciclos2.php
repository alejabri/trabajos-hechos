<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="ciclos2.css">
    <title>Document</title>
</head>
<body>

<h1>lista</h1>

<form action="ciclos3.php" method="get">

<?php

    $op1=$_GET['op1'];
    echo '<input type="hidden" name="op1" value="'.$op1.'">';

    if(isset($_GET['enviar'])) {
        $op1=$_GET['op1'];



        for($x=1;$x<=$op1;$x++) {
            echo '<label>elemento'.$x.'</label>';
            echo '<input type="text" name="name'.$x.'" placeholder="ingrese un elemento">';
            echo '<br>';
        }

    }

    ?>

    <span>
    <input type="radio" name="opcion" value="ordenada" id="1">
    <label for="1">ordenada</label>
    </span>
    <span>
    <input type="radio" name="opcion" value="numerada" id="2">
    <label for="2">numerada</label>
    </span>

    <input type="submit" name="generar" class="boton">
</form>
</body>
</html>