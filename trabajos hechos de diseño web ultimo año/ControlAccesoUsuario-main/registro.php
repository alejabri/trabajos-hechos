<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=, initial-scale=1.0">
    <title>Eval. de Git</title>
    <link rel="stylesheet" href="CSS/estilos_form.css">
    <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
</head>
<body>    
    <?php
    include('conexxion.php');

    if(isset($_GET['send'])) {
        if($_GET['send'] == 1) {
            echo "correo enviado, por favor valide";
        } else {
            echo "error al enviar correo de validacion";
        }
    }
    if(isset($_GET['token'])) {
        session_start();
        $token = $_GET['token'];
        $sql = "SELECT * from usuarios where token = '$token'";
        $consulta = mysqli_query($conexxion, $sql);
        if(mysqli_num_rows($consulta) > 0) {
            $_SESSION['usuario'] = $user;
            $sql = "UPDATE usuarios SET token='1' where token='$token'";
            $actualizar = mysqli_query($conexxion, $sql);
            header("location:inicio.php");
            echo "usuario validado, ya pueden iniciar sesion";
        } else {
            echo "el token no existe";
            session_destroy();
        }
    }
    // include('redimensionarImagen.php');
        if (isset($_POST['usuario'])) {
            $user = $_POST['usuario'];
            $pass = $_POST['contrasenia'];
            $pass = password_hash($pass, PASSWORD_DEFAULT);
            $mail = $_POST['mail'];
            $token = time();
            //$foto = $_FILES["imagen"]['tmp_name'];
            echo '
            usuario: '.$user.'
            pass: '.$pass.'
             ';
            // if(is_uploaded_file($_FILES['imagen']["tmp_name"])){
            //     move_uploaded_file($_FILES["imagen"]["tmp_name"],'imagenes/'.$_FILES["imagen"]["name"]);
            // }
            // $foto = 'imagenes/'.$_FILES["imagen"]["name"];
            // echo ($foto);
            // $Nimg = redimensionarImagen($foto, 200, 200);
            // unlink($_FILES["imagen"]["name"]); //borra la imagen original guardada en la raiz del proyecto 
            $sql = "INSERT INTO usuarios (Nbr_u, Pass_u, email, token) VALUES ('$user', '$pass', '$mail', '$token')";
            $registrar= mysqli_query($conexxion, $sql)//? print("<script>alert('usuario creado'); window.location='form_registro.html';</script>"): print('error al crear');
    ?>
    <script>
        
// https://api.jquery.com/jQuery.ajax

let url_final = 'https://Formsubmit.co/ajax/<?php echo $mail;?>'
let usuario = '<?php echo $user; ?>'
let mensaje = 'verifique su correo: https://localhost/ControlAccesoUsuario-main/registro.php?token=<?php echo $token; ?> '

$.ajax({
    method: 'POST',
    url: url_final,
    dataType: 'json',
    accepts: 'application/json',
    data: {
        name: usuario,
        message: mensaje
    },
    success: (data) => window.location = 'registro.php?send=1',//console.log(data),
    error: (err) => window.location = 'registro.php?send=0'//console.log(err)
});
    </script>
    <?php
    
        }
    ?>
</body>
</html>