<?php 

//creamos los nombres de la variables correspondientes a los cuatro valores
//nombre del host(servidor)
$host='localhost';
//
$user='root';
//contraseña de la base de datos
$contra='';
//nombre de ñla base de datos que se va a usar
$base='usuarios';

//creamos la variable que contengan la conuslta 

//si se quiere se puede usar el @ antes de mysqli
$conexion=mysqli_connect($host,$user,$contra,$base);

//comprueba si la conexxion existe sino existe actua el if
if(!$conexion) {
    echo "error en la conexion";
}

?>