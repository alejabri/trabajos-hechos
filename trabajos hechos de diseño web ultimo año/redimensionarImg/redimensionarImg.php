<?php 
function redimensionarImagen($imagen, $ancho_final, $alto_final){
	
//Extraemos algunos atributos de la imagen
	list($ancho_orig, $alto_orig, $nroTipo) = getimagesize($imagen);


//Creamos una variable imagen a partir de la imagen original segun el tipo
	switch ($nroTipo) {
		case 2: $img_original=imagecreatefromjpeg($imagen);
			break;
		case 3: $img_original=imagecreatefrompng($imagen);
			break;
		default:
			echo "tipo de archivo incorrecto";
			break;
	}
//Creamos una imagen en blanco de tamaño $ancho_final  por $alto_final 
	$nueva_img = imageCreateTrueColor($ancho_final, $alto_final);

//Copiamos $img_original sobre la imagen que acabamos de crear en blanco 
imagecopyresampled($nueva_img, $img_original, 0, 0, 0, 0, $ancho_final, $alto_final, $ancho_orig, $alto_orig);


//Se destruye variable $img_original para liberar memoria
	imagedestroy($img_original);


//Definimos la calidad de la imagen final
	$calidad=70;	


//Definimos el nombre final de la imagen concatenando al nombre original
//un identificador unico con la funcion time()
$nombre_imagen =time()."-".$imagen;


//Se crea la imagen final en el directorio indicado
	imagejpeg($nueva_img,"imagenes/$nombre_imagen",$calidad);


//retornamos el nombre de la nueva imagen
	return $nombre_imagen;
}

?>
