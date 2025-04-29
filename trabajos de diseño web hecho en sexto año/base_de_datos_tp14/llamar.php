<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
    <form action="Base_de_datos.php" method="post">

        <input type="text" name="nombre" id="1">
        <label for="1">usuario</label>

        <input type="password" name="contraseña" id="2">
        <label for="2">contraseña</label>

        <input type="submit" name="boton" value="enviar"id="3">

    </form>

    <?php

        include "Base_de_datos.php";

        //validar campos de los imputs en llamar.php
        $alerta='';
        //validar campos
        if(!empty($_post)) {
        //el empty comprueba si el campo esta vacio
        if(empty ($_post['nombre']) && empty ($_post['contraseña'])) {
            $alerta="completar el dato";
        }else {
        //isset comprueba si existe el dato
            if(isset ($_post['nombre']) && isset ($_post['contraseña'])) {
                $nombre=$_post['nombre'];
                $contraseña=$_post['contraseña'];
                //consulta
                $consulta=mysqli_query($conexion,"SELECT * FROM login WHERE, nombre='$nombre' AND clave='$contraseña'");
                echo "bienvenido";
            } else {
                echo "no existe el usuario";
            }
        }
    }

    ?>

</body>
</html>