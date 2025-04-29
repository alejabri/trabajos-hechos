<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="ppt.css">
    <title>Document</title>
</head>
<body>
<?php
if(!isset($_GET['jugada'])) {
    $bot=0;
    $user=0;
} else {
    $bot=$_GET['bot'];
    $user=$_GET['user'];


    if(isset($_GET['boton'])) {
        
        $opcion=$_GET['jugada'];
        $asar=rand(1,3);

        if($opcion == "piedra") {

        switch($asar) {
            case '1': echo '<p>maquina: piedra</p>';
            echo '<p>jugador: '.$opcion.'</p>';
            break;
            case '2': echo '<p>maquina: papel</p>';
            echo '<p>jugador: '.$opcion.'</p>';
            $bot++;
            break;
            case '3': echo '<p>maquina: tijera</p>';
            echo '<p>jugador: '.$opcion.'</p>';
            $user++;
            break;
        }
        }

        if($opcion == "papel") {

        switch($asar) {
            case '1': echo '<p>maquina: piedra</p>';
            echo '<p>jugador: '.$opcion.'</p>';
            $user++;
            break;
            case '2': echo '<p>maquina: papel</p>';
            echo '<p>jugador: '.$opcion.'</p>';
            break;
            case '3': echo '<p>maquina: tijera</p>';
            echo '<p>jugador: '.$opcion.'</p>';
            $bot++;
            break;
        }
        }

        if($opcion == "tijera") {

        switch($asar) {
            case '1': echo '<p>maquina: piedra</p>';
            echo '<p>jugador: '.$opcion.'</p>';
            $bot++;
            break;
            case '2': echo '<p>maquina: papel</p>';
            echo '<p>jugador: '.$opcion.'</p>';
            $user++;
            break;
            case '3': echo '<p>maquina: tijera</p>';
            echo '<p>jugador: '.$opcion.'</p>';
            break;
        }
        }

        echo '<b>contador del bot: '.$bot.'</b>';
        echo'<b>contador del usuario: '.$user.'</b>';

        if($bot == 3) {
            echo '<p class="final"> usted a perdido</p>';
            echo '<style type="text/css">form {display:none}</style>';
    }
        if($user == 3) {
            echo '<p class="final">usted a ganado</p>';
            echo '<style type="text/css">form {display:none}</style>';
        }
    }

        }
    ?>

<form actio=" " method="get">
    <input type="radio" name="jugada" value="piedra" id="1">
    <label for="1">piedra</label>
    <input type="radio" name="jugada" value="papel" id="2">
    <label for="2">papel</label>
    <input type="radio" name="jugada" value="tijera" id="3">
    <label for="3">tijera</label>
    <input type="hidden" name="bot" value="<?php echo $bot; ?>">
    <input type="hidden" name="user" value="<?php echo $user; ?>">

    <input type="submit" name="boton" value="siguiente" class="boton">
    </form>
</body>
</html>