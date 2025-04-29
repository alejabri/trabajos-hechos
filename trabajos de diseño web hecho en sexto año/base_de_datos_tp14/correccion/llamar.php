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

        <input type="text" name="nombre" id="1">
        <label for="1">usuario</label>

        <input type="password" name="contraseña" id="2">
        <label for="2">contraseña</label>

        <input type="submit" name="boton" value="enviar"id="3">

    </form>

    <?php
    //requiered "Base_de_datos.php";
        include "Base_de_datos.php";

        

        if($_POST) {
        //el empty comprueba si el campo esta vacio
        //isset comprueba si existe el dato
           
            $nombre=$_POST['nombre'];
            $contraseña=$_POST['contraseña'];
            //consulta
            $consulta=mysqli_query($conexion,"SELECT * FROM login WHERE nombre='$nombre' AND clave='$contraseña'");
            $valor_booleano=mysqli_num_rows($consulta);
                if($valor_booleano == 1) {
                    echo "usuario existente";
                    //header ("location:pagina.php"); <-- para que envie a otra pagina si queremos
                }
                else {
                    echo "no existe";
                        
                }
            }
    

    ?>

</body>
</html>