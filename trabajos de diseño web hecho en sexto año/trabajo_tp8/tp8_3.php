<?php

        $color=$_GET['color'];
        $color2=$_GET['color2'];
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="tp8_3.css">
    <title>Document</title>
    <?php
        echo '<style type="text/css">
        a {
            color: '.$color2.';
            background: '.$color.';
            border-bottom: 2px solid '.$color2.';
            padding: 10px;
            margin: 10px;
            text-decoration: none;
        }

        a:hover{
            color: '.$color.';
            background: '.$color2.';
            border-bottom: 2px solid '.$color.';
        }
        nav, h1 {
            text-align: center;
        }
         </style>';
        ?>

</head>
<body>
    <h1>menu dinámico</h1>
    <nav>

    <?php
    if(isset($_GET['siguiente'])) {
        $canti=$_GET['canti'];
        

    for($x=1;$x<=$canti;$x++){
        $texto=$_GET['texto'.$x];
        $url=$_GET['url'.$x];
        echo '<a href="'.$url.'" target="_blank">'.$texto.'</a>';
    }

}

    ?>

    </nav>
</body>
</html>