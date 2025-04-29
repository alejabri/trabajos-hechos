<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="calculadora.css">
    <title>Document</title>
</head>
<body>
    <form action=" " method='get'>

        <h1>calculadora</h1>
        
        <span>
        <label>numero 1</label>
        <input type="number" name="num1" placeholder="ingrese un numero" class="num1">
        </span>
        <span>
        <label>numero 2</label>
        <input type="number" name="num2" placeholder="ingrese otro numero" class="num2">
        </span>

        <div>
        <input type="radio" name="opcion" value="sumar" id= "1">
        <label for="1">sumar</label>
        <input type="radio" name="opcion" value="restar" id= "2">
        <label for="2">restar</label>
        <input type="radio" name="opcion" value="dividir" id= "3">
        <label for="3">dividir</label>
        <input type="radio" name="opcion" value="multiplicar" id= "4">
        <label for="4">multiplicar</label>
        </div>

        <input type="submit" name="calcular" value="calcular" class="boton">
    
    <?php
    if (isset ($_GET['calcular'])) {
        $num1=$_GET['num1'];
        $num2=$_GET['num2'];
        $opcion=$_GET['opcion'];

        switch($opcion) {
            case 'sumar': $sumar=$num1+$num2;
                echo '<p>la suma es: '.$sumar.'</p>';
            break;
            case 'restar': $restar=$num1-$num2;
            echo '<p>la resta es: '.$restar.'</p>';
            break;
            case 'dividir': if($num2 <=0){
                echo '<p>no se puede divir</p>';
            }else {
                echo '<p>la division es:'.$dividir=$num1/$num2.'<p>';
            }
            break;
            echo '<p>la division es: '.$dividir.'<p>';
            break;
            case 'multiplicar': $multiplicar=$num1*$num2;
            echo '<p>la multiplicacion es: '.$multiplicar.'<p>';
            break;
        }
    }
    ?>
    </form>
</body>
</html>