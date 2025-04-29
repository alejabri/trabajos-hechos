<?php
$usuario= $_GET['usuario'];
$nya= $_GET['nya'];
$edad= $_GET['edad'];
$biografia= $_GET['biografia'];
$color= $_GET['color'];
$email= $_GET['email'];
$cumpleannos= $_GET['cumpleannos'];
$nacionalidad= $_GET['nacionalidad'];

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    echo '<h1>perfil de '.$usuario.'</h1>';
    echo '<p>nombre y apellido: '.$nya.'</p>';
    echo '<p>edad: '.$edad.'</p>';
    echo '<p>biografia: '.$biografia.'</p>';
    echo '<p>color favorito: '.$color.'</p>';
    echo '<p>correo electronico: '.$email.'</p>';
    echo '<p>fecha de nacimiento: '.$cumpleannos.'</p>';
    echo '<p>nacionalidad: '.$nacionalidad.'</p>';
    ?>
</body>
</html>
