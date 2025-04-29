<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
   <!-- <ul>
    <li>elemento 1</li>
    <li>elemento 2</li>
    <li>elemento 3</li>
    <li>elemento 4</li>
    <li>elemento 5</li>
    </ul> -->

    <ul>
    <?php

    for($x=1;$x<=5;$x++) {
        
        echo '<li>elemento'.$x.'</li>';
    }

    ?>

</ul>
</body>
</html>
 