<?php 

$localidades = array("Dock Sud"=> "B1871", "Avellaneda Centro" => "B1870", "Piñeiro" => "B1868", "Gerli" => "B1869", "Sarandi" => "B1872", "Villa Dominico" => "B1874", "Wilde" => "B1875");

echo "el codigo de sarandi es ".$localidades["Sarandi"];

echo '<table border=2><th>localidad</th><th>codigo postal</th>';
foreach ($localidades as $localidad => $codigo_postal) {
    echo '<tr><td>'.$localidad.'</td><td>'.$codigo_postal.'</td></tr>';
}
echo '</table>';

echo "la cantidad de localidades en Avellaneda son ".count($localidades);
?>