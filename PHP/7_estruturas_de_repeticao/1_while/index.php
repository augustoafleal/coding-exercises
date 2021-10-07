<?php

// Ínicio do contador
$x = 0;

// Definição da strutura

while ($x < 10) { 

    // Bloco de código
    echo $x . "<br>";

    // Incremento do contador
    $x++;

}

echo "<br> Continuando o código <br>";

// Ínicio do contador
$y = 0;

// Definição da strutura

while ($y < 10) { 

    // Bloco de código
    echo $y . "<br>";

    // Incremento do contador
    $y += 2;

}

echo "<br> Continuando o código <br>";

// --- EXERCÍCIO 27 ---
echo "<br> --- EXERCÍCIO 27 --- <br>";

$array = [1, "2", true, "teste", 27.2, 89, "outra string", "mais uma string", "última string", NULL];
$x = count($array);
$contador = 0;

while($contador < $x){
    if(is_string($array[$contador])){
        echo $array[$contador] . "<br>";
    }
    
    $contador++;

}

