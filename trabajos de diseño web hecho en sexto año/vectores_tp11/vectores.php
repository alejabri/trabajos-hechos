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
    
    $vector = array(46, 16, 95, 3, 30);
    $r = count($vector);

    for($i=0; $i < $r; $i++){
        echo '<ul><li>'.$vector[$i].'</li></ul>';
    }
    ?>

    <form>
        <label>ingrese un numero</label>
        <input type="number" name="num1">

        <label>ingrese otro numero</label>
        <input type="number" name="num2">

        <input type="submit" name="boton">
    </form>
    
    <?php 

    $num1=$_GET['num1'];
    $num2=$_GET['num2'];
    $vector = array(46, 16, 95, 3, 30, $num1, $num2);

    echo $vector[6];

    ?>


</body>
</html>