<?php

$a = 10;

$b = 15;

function testeEscopo(){

    $a = 5;

    global $b;
    $b++;
    
    static $c = 0;
    $c++;

    echo "ESCOPO LOCAL DE A: $a <br>";
    
    echo "ESCOPO GLOBAL NA FUNÇÃO DE B: $b <br>";

    echo "ESCOPO STATIC DE C: $c <br>";
}

echo "ESCOPO GLOBAL DE A: $a <br>";
echo "ESCOPO GLOBAL DE B: $b <br>";

testeEscopo();

echo "ESCOPO GLOBAL DE B 2: $b <br>";

testeEscopo();

// --- EXERCÍCIO 36 ---
echo "<br> --- EXERCÍCIO 36 --- <br>";

function arrMaiores($num1, $num2, $num3){

    $arr = [$num1, $num2, $num3];

    $arr2 = [];

    foreach($arr as $num){
        if($num > 7){
            array_push($arr2, $num);
        }
    }

    return $arr2;

}

print_r(arrMaiores(1, 17, 455));
