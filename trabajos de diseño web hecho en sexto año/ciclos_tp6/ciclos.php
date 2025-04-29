<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="ciclos.css">
    <title>Document</title>
</head>
<body>
    <?php

    /*otros ciclos
    
    $w=0;
    do {
        echo $w.'<br>';
        $w++;
    } while ($w<=10);

    $y=1;
    while($y<=10) {
        echo $y.'<br>';
        $y++;
    }

    for($x=1;$x<=10;$x++) {
        echo $x.'<br>';
    }*/

    for($L=0;$L<8;$L++) {
        if($L%2==0) {
        //generar dinamicamente 8 parrafos 
        $color="rojo";
        } else {
            $color="azul";
        }
    
    echo '<p class="'.$color.'">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur, quas. Aliquam tempora alias natus, provident, distinctio veritatis corporis perspiciatis repellat vitae et quibusdam non minima molestiae nihil, atque suscipit magni?</p><br>';
    }
    ?>
</body>
</html>