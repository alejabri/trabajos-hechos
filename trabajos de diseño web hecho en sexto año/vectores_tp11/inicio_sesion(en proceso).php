<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action=" " method="get">
        <h5>login</h5>

        <label>usuario</label>
        <input type="text" name="usuario">

        <label>contraseña</label>
        <input type="password" name="contraseña">

        <input type="submit" name="siguiente">
    </form>

    <?php
    if(isset($_GET['siguiente'])) {

        $usuarios = array("carlos" => 1234, "juan" => "a", "maria" => 123456);
        $usuario = $_GET['usuario'];
        $contraseña = $_GET['contraseña'];
        $existe=false;

        foreach($usuario as $gente => $contraseñas) {
            if($usuario == $gente && $usuario == $contraseñas) {
                $existe = true;
            }
        }

        if($existe == true) {
            echo "contraseña y usuario correctos";
        }
        else {
            echo "contraseña y usuario incorrectos";
        }

    }

    ?>
    
</body>
</html>