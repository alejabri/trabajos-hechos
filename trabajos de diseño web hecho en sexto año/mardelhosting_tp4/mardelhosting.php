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
    <link rel="stylesheet" href="mardelhosting1.css">
    <title>Document</title>
</head>
<body>
    <h1>MARDELHOSTING</h1>
    <form action=" " method='get'>
        <span class="planes">
            <input type="radio" name="opcion" value="mediano" id="1">
            <label for="1">mediano $1.200</label>
        </span>
        <span class="planes">
        <input type="radio" name="opcion" value="pro" id="2">
        <label for="2">pro 2.200$</label>
</span>
        <span class="planes">
        <input type="radio" name="opcion" value="mega" id="3">
        <label for="3">mega 4.500$</label>
</span>

        <a><label>ingrese cantidad de meses</label></a>
        <input type="number" name="mes">

        <input type="submit" name="calcular" value="total" class="boton">
    </form>
</body>
</html>

<?php
if(isset($_GET['calcular'])){
    $mes=$_GET['mes'];
    $opcion=$_GET['opcion'];

switch($opcion) {
    case 'mediano': 
    $precio=1200;
    break;
    case 'pro':
    $precio=2200;
    break;
    case 'mega':
    $precio=4500;
    break;   
}
$total=$precio*$mes;
$descuento=$precio*20/100;
$totalydesc=$total-$descuento;
if($mes>=12){
    echo '<p>los meses son:'.$mes.'</p>';
    echo '<p>descuento:'.$descuento.'</p>';
    echo'<p>total sin descuento:'.$total.'</p>';
    echo'<p>total con descuento:'.$totalydesc.'</p>';
}else{
    echo '<p>los meses son:'.$mes.'</p>';
    echo'<p>total sin descuento:'.$total.'</p>';
}
}
?>