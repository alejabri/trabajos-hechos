<!--la empresa mardelhosting.com ofrece a sus clentes 3 opciones de hosting mediano 1.200$, 
pro 2.200$ y mega 4.50$ mensuales, teniendo una promocion del 20% de descuento para los 
clientes que contraten el servicio por 12 o mas meses.
armar un formulario que permita calcular y mostrar la opcion elegida cantidad de 
meses cotratados descuento si lo obtuviese y total a pagar -->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action=" " method='get'>
        <input type="radio" name="opcion" value="mediano" id="1">
        <label for="1">mediano 1.200$</label>
        <input type="radio" name="opcion" value="pro" id="2">
        <label for="2">pro 2.200$</lable>
        <input type="radio" name="opcion" value="mega" id="3">
        <label for="3">mega 4.500$</label>

        <label>ingrese cantidad de meses</label>
        <input type="number" name="mes">

        <input type="submit" name="calcular" value="total">
    </form>
</body>
</html>

<?php
if(isset($_GET['calcular'])){
    $mes=$_GET['mes'];
    $opcion=$_GET['opcion'];
    $mediano=1200;
    $pro=2200;
    $mega=4500;


switch($opcion) {
    case 'mediano': $mediano=$mediano*$mes;
        if($mes>=12){
        $descuento=$mediano*20/100;
        echo 'el total a pagar es:'.$descuento;
    }
    else{
        echo 'el total a pagar es:'.$medium;
    }
    break;
    case 'pro': $pro=$pro*$mes;
        if ($mes>=12){
        $descuento=$pro*20/100;
        echo 'el total a pagar es:'.$descuento;
    }else {
        echo 'el total a pagar es:'.$pro;
    }
    break;
    case 'mega': $mega=$mega*$mes;
        if($mes>=12){
        $descuento=$mega*20/100;
        echo 'el total a pagar es:'.$descuento;
    }else{
        echo 'el total a pagar es:'.$mega;
    }
    break; 
    
}
}
?>