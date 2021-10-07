<?php

$a = [1, 2, 3];

// O resultado serão os índices: "Array ( [0] => 1 [1] => 2 [2] => 3 )""
print_r($a); 

echo "<br>";

// Escolhendo um dado do índice para imprimir:
echo $a[0];
echo "<br>";

// Array com diferentes tipos de dados:
$a2 = ["Teste", 100, true];
print_r($a2);

echo "<br>";

echo $a2[0];