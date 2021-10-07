<?php

$arr = range(1, 10);
$arr2 = range(2, 200, 10);
$arr3 = range(400, 450, 5);
$arr4 = ["teste", "novoTeste", "outroTeste"];


print_r($arr); echo "<br>";

print_r($arr2); echo "<br>";

print_r($arr3); echo "<br>";

print_r($arr4); echo "<br>";

// UNIR ARRAYS

$arrMerge = array_merge($arr, $arr2, $arr3, $arr4);
print_r($arrMerge);