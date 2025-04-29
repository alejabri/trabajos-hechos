<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action=" " method="post" enctype="multipart/form-data">
        <input type="text" name="usuario" placeholder="Ingrese su nombre">
        <input type="password" name="pass" placeholder="Ingrese su contraseña">
        <input type="submit" value="subir" name="subir">
    </form>

    <?php
    include('conexxion.php');

    if(isset($_POST['subir'])) {
        session_start();
        $usuario = $_POST['usuario'];
        $pass = $_POST['pass'];

        $sql = "SELECT * from usuarios where Nbr_u = '$usuario' and token ='1'";
        $consulta = mysqli_query($conexxion, $sql);
        echo "gfhgfh";
        if(mysqli_num_rows($consulta) > 0) {
            $registro = mysqli_fetch_assoc($consulta);
            echo "2";
            if(password_verify($pass, $registro['Pass_u'])) {
                echo "3";
                $_SESSION['usuario'] = $usuario;
                header("location:inicio.php");
            } else {
                echo 'contraseña incorrecta \n';
            }
            echo 'el usuario no existe o no valido el correo';
        }
    }

    ?>
</body>
</html>