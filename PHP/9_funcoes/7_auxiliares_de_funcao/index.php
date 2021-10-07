<?php

function soma($a, $b){

    print_r(func_get_args());

    echo "<br>";

    echo func_num_args();

    return $a + $b;

}

soma(2, 4);

// --- EXERCÍCIO 38 ---
echo "<br> --- EXERCÍCIO 38 --- <br>";

$arr = [
    "banana",
    "maçã",
    "laranja",
    "tapioca",
    "leite"
];

function conversor($arr){

    $str = "Você adquiriu os itens: ";
    
    $str .= implode(", ", $arr) . ".";

    return $str;
}

echo conversor($arr);