<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="tp8_2.css">
    <title>Document</title>
</head>
<body>
    <form action="tp8_3.php" method="get">

    <h1>ingresar enlaces</h1>
    <?php

    $canti=$_GET['canti'];

if(isset($_GET['siguiente'])) {
    $canti=$_GET['canti'];


    for($x=1;$x<=$canti;$x++){
        echo '<span><label>nombre del enlace '.$x.'</label>';
        echo '<input type="text" name="texto'.$x.'">';
        echo '<label>ingrese url '.$x.'</label>';
        echo '<input type="text" class="url" name="url'.$x.'"></span>';
    }
    echo '<input type="hidden" name="canti" value="'.$canti.'">';

}

?>

<label class="color">color de fondo</label>
<input type="color" name="color" class="color">
<label class="color">color de letra</label>
<input type="color" name="color2" class="color">
<form>

<input type="submit" value="siguiente" name="siguiente" class="boton">

</body>
</html>