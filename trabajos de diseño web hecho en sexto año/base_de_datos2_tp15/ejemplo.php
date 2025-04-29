<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" type="text/css" href="../css/estilo1.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	
	<title>Login</title>
</head>
<body class="cuerpo-principal">
	<nav class="navbar fixed-top navbar-light row">
		<div class="col-12 text-center">
			<a class="navbar-brand" href="Login.php"><h5>Login</h5></a>
		</div>
	</nav>
	<div class="container">
			<div class="recuadro-formulario">
				<div class="titulo">
					<p class="titulo-formulario">Iniciar sesión</p>
				</div>
				<form action="" method="post">

					<div class="grupo-formulario">
						<div class="iconInput col-md">
							<i class="fas fa-users"></i> Usuario
							<input type="text" name="nombreUsuario" id="usuarios" class="form-control" placeholder="Nombre">
						</div>
					</div>
					<div class="grupo-formulario">
						<div class="iconInput col-md">
							<i class="fas fa-key"></i> Clave
							<input type="password" name="clave" id="contraseña" class="form-control" placeholder="Contraseña" >
						</div>		
					</div>
					<div class="grupo-formulario btn1 text-center">
						<div class='alert mt-4'></div>
							<input type="submit" id="login" name="iniciarsesion" value="Ingresar" class="btn btn-primary">
						</div>
					<div class="container text-center">
						<br>
						<a  class="link-registrar" href="registrar.php"><i class="fas fa-arrow-circle-right"></i> <h6>Registrarse ahora</h6></a>
					</div>
				</form>	
			</div>
		</div>

		<?php

			//aca arriba creamos el inicio de la comprobacion de los datos 
			include "conexion.php";
		if($_POST){

			$usuario= $_POST['nombreUsuario'];
			$clave= $_POST['clave'];

			//creamos una varaible que contiene a la consulta

			$consulta=mysqli_query($conexion,"SELECT * FROM usuarios WHERE nombre= '$usuario' AND password= '$clave'");

			$filas= mysqli_num_rows($consulta);

			if($filas==1){

				//header("location:index.php");

				echo 'holis';
			}else{
				echo "error en la carga del usuario ";
			}

		}

			


?>

		<footer class="footer fixed-bottom text-center py-1">
			<div class="container">
			</div>
		</footer>

	<script defer src="https://use.fontawesome.com/releases/v5.13.0/js/all.js"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</body>
</html>