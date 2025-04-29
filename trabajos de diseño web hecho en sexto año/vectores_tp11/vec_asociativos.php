<?php

$capitales = array("Argentina" => "Bs.As", "Paraguay" => "Asuncion", "Chile" => "Santiago");

echo $capitales["Argentina"];
echo '<br>';

$capitales["Uruguay"] = "Montevideo";

foreach($capitales as $pais => $capital) {
    echo "La capital de ".$pais." es ".$capital.'<br>';
}