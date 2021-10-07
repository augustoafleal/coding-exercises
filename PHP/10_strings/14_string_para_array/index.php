<?php

$str = "Testando o explode.";

$fraseArray = explode(" ", $str);

print_r($fraseArray) . "<br>";


// --- EXERCÍCIO 43 ---
echo "<br> --- EXERCÍCIO 43 --- <br>";

$strExercicio = "carro, navio, helicóptero, barco, jangada";

$strNovaStr = explode(",", $strExercicio);

print_r($strNovaStr) . "<br>";

foreach($strNovaStr as $item){
    echo "Item: $item <br>";
}



