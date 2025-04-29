<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

<?php

//se inicializa el vector igualando todos los valores en 0
$vector[]=0;
echo '<ul>';
for($i=0; $i<5; $i++) {
    //se muestra el vector en el cual dependiendo cuanto es i que 
    //es igual a la variable rand asi poder mostrar x cantidad 
    //cada uno aleatorio
    echo '<li>'.$vector[$i]=RAND(1,100).'</li>';
}  
echo '</ul>';


?>
    
    <form action=" " method='get'>

        <label>ingrese un numero</label>
        <input type="number" name="num1">

        <label>ingrese otro numero</label>
        <input type="number" name="num2">

        <label>modifique el valor 3</label>
        <input type="number" name="num3">

        <input type="submit" name="boton">
    </form>



    <?php
    if(isset($_GET['boton'])){
    $num1=$_GET['num1'];
    $num2=$_GET['num2'];
    $num3=$_GET['num3'];


    $vector[5]=$num1;
    $vector[6]=$num2;
    $vector[2]=$num3;
    //el unset permite que se elimine la variable de la posicion elegida
    unset($vector[3]);
    
    echo '<ul>';
    foreach($vector as $vectores) {
        echo '<li>'.$vectores.'</li>';
    }
    echo '</ul>';
    
    }
    ?>

</body>
</html>