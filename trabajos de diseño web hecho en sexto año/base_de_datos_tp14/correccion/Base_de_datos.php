<?php
//creamos las variables que guarden los datos de la base de datos

$host='localhost';
$usuario='root';
$password='';
$base='prueba';

$conexion=mysqli_connect($host,$usuario,$password,$base);
if(!$conexion) {
    echo"error de coneccion";
}
?>