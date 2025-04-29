<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method="post">
        
        <h1>login</h1>

        <label>usuario</label>
        <input type="text" name="nombre" class="usuario">

        <label>contraseña</label>
        <input type="password" name="contraseña" class="contraseña">

        <input type="submit" name="ingresar" value="ingresar" class="boton">
        <a href="indexa.php"><input type="submit" name="registrarse" value="registrarse"class="boton"></a>

    </form>

        <?php

        //con esto se comprueban los datos llamados en el archivo coneccion.php donde esta la base de datos
        include "conexion.php";

        if($_POST) {
            $nombre=$_POST['nombre'];
            $clave=$_POST['contraseña'];
            
            //creamos una varaible que contiene a la consulta

            $consulta=mysqli_query($conexion, "SELECT * FROM usuarios WHERE nombre='$nombre' AND password='$clave'");

            //guarda el valor dado de la $consulta en $valor_booleano que solo puede ser 1 o 0
            $valor_booleano=mysqli_num_rows($consulta);

            if($valor_booleano == 1) {
                echo "ingreso exitoso";

                //header("location:index.php");
            } 
            else {
                echo "error en la carga del usuario ";
                header("location: indexa.php?nombre='$nombre");
            }
        }

        ?>
</body>
</html>