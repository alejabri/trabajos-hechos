<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<?php
if(!isset($_GET['jugada'])) {
    $bot=0;
    $user=0;
}else {
    $bot=$_GET['bot'];
    //$user=$_GET['user'];
}
echo $bot;
$bot++;
?>
    <form action=" " method="get">
        <input type="radio" name="jugada" value="tijera">
        <label>tijera</label>
        <input type="hidden" name="bot" value="<?php echo $bot;?>">
        <input type="submit" name="enviar">
    </form>
</body>
</html>