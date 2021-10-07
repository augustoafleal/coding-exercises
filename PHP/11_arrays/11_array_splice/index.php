<?php

// RESGATAR ELEMENTOS DE ARRAY
// REMOVER ELEMENTOS

$arr = range(1, 6);

$removidos = array_splice($arr, 1, 2);

print_r($arr);
echo "<br>";

print_r($removidos);
echo "<br>";

//NOVO ARRAY

$arr2 = range(1, 6);

$removidos2 = array_splice($arr2, 3);

print_r($arr2);
echo "<br>";

print_r($removidos2);
echo "<br>";

// NOVO ARRAY

$arr3 = range(1, 6);

$removidos3 = array_splice($arr3, 3, -1);

print_r($arr3);
echo "<br>";

print_r($removidos3);
echo "<br>";

// --- EXERCÍCIO 48 ---
echo "<br> --- EXERCÍCIO 48 --- <br>";

$arrExerc = [
    "batata",
    "maçã",
    "pera",
    "feijão",
    "arroz"
];

$removExerc = array_splice($arrExerc, 2, -1);

print_r($arrExerc);
echo "<br>";

print_r($removExerc);
echo "<br>";