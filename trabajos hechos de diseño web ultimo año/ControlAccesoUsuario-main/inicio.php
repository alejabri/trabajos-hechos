<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    session_start();
    if(isset($_SESSION['usuario'])) {
        echo $_SESSION["usuario"];
        echo '<a href="logout.php">salir</a>';
    } else {
        echo '<a href="login.php">login</a>';
    }
    ?>
</body>
</html>