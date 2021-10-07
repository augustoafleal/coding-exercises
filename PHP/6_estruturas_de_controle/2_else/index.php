<?php

if(5 < 2) { 
    echo "Entrou no if <br>";
} else {
   echo  "Entrou no else <br>";
}

// --- EXERCÍCIO 24 ---
echo "<br> --- EXERCÍCIO 24 --- <br>";

$a = "Texto";
$b = 4;
$c = true;

if(is_int($a)){
    echo "É um inteiro <br>";
} else {
    echo "Não é um inteiro <br>";
}

if(is_int($b)){
    echo "É um inteiro <br>";
} else {
    echo "Não é um inteiro <br>";
}

if(is_int($c)){
    echo "É um inteiro <br>";
} else {
    echo "Não é um inteiro <br>";
}


// --- EXERCÍCIO 24B ---
echo "<br> --- EXERCÍCIO 24B --- <br>";

$a = 23.2;

if($a > (float) 80) { 
    echo "Peso de " . $a . "kg está acima do limite. <br>";
} else {
    echo "Peso de " . $a . "kg está dentro do limite. <br>";
}
