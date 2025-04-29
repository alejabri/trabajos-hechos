<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="megaventasonline.css">
    <title>Document</title>
</head>
<body>
    <h1>MEGAVENTASONLINE</h1>
    <h2>por nuestro 10 aniversario estamos dando descuentos
        del 15%, 25% y hasta 40% por las compras que superen
        los 5000 pesos</h2>
        <form action=" " method="get">
            <label>ingrese importe</label>
            <input type="number" name="dinero">

            <input type="submit" name="calcular" class="boton">
        </form>
</body>
</html>

<?php
/*megaventasonline.com esta esta festejando su desimo aniversario 
entregando descuento por todas las compras mayoresa a 5000 pesos.
para esto cuemta con una pequeña ruleta de tres posiciones (15%, 25% y 40%) 
que ustedes deberan simular con la funcion rand(1,3) quedara como resultado 
un numero al azar entre 1 y 3.
entonces ingresando el importe de la compra el sistema debera generar 
el siguiente mensaje: hoy (fecha actual), usted a gastado (importe)(pesos) 
y la suerte le a otorgado un (15%, 25%, 40% de descuento), con lo cual solo 
abonara (importe con descuento otorgado)pesos
*/
if(isset($_GET['calcular'])) {
    $dinero=$_GET['dinero'];
    $azar=rand(1,3);
    $fecha=date("d/m/Y");

    switch($azar) {
        case 1: 
        $porcentaje=15;
        break;
        case 2:
        $porcentaje=25;
        break;
        case 3: 
        $porcentaje=40;
        break;
    }

    $desc=$dinero*$porcentaje/100;
    $total=$dinero-$desc;

    if($dinero>5000) {
        echo '<p>fecha actual:'.$fecha.'</p>';
        echo '<p>el importe es: '.$dinero.'</p>';
        echo '<p>el descuento es: '.$porcentaje.'%</p>';
        echo '<p>descuento aplicado: '.$desc.'</p>';
        echo '<p>total a pagar: '.$total.'</p>';

    } else {
        echo '<p>fecha actual:'.$fecha.'</p>';
        echo '<p>total a pagar: '.$dinero.'</p>';
    }
}