<?php

$str = "Esta é a minha string modelo.";

$minha = substr($str, 10, 5);

echo $str . "<br>";

echo $minha . "<br>"; 

// OMITINDO O COMPRIMENTO DA PALAVRA

$str2 = "Esta é outra string";

$novaStr = substr($str2, 6);

echo $novaStr . "<br>";

// PASSANDO COMPRIMENTO NEGATIVO PARA ELIMINAR DO ÚLTIMO ÍNDICE PARA TRÁS

$str3 = "Esta é outra string abc";

$novaStr2 = substr($str3, 6, -3);

echo $novaStr2 . "<br>";

// --- EXERCÍCIO 42 ---
echo "<br> --- EXERCÍCIO 42 --- <br>";

$strExercicio = "Cadê o meu queijo? Ele estava aqui em cima";

echo substr($strExercicio, 12, 6) . "<br>";

echo substr($strExercicio, 24, 6) . "<br>";
