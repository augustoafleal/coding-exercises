<?php

$arr = [
    [1, 2, 3],
    [4, 5, 6]
];

print_r($arr);
echo "<br>";

echo $arr[0][1] . "<br>"; // acessar primeiro array, segundo elemento
echo $arr[1][2] . "<br>"; // acessar segundo array, terceiro elemento

echo count($arr). "<br>"; // conta o número de arrays internos
echo count($arr[0]). "<br>";


// --- EXERCÍCIO 46 ---
echo "<br> --- EXERCÍCIO 46 --- <br>";

$arrExer = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 10, 11, 12]
];

foreach($arrExer as $array){
    echo "<br> Array externo começando <br>";
    foreach($array as $item){
        echo $item . "<br>";
    }
}

