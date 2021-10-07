<?php

// COM VALORES 

$arr = [
    "Jeca" => 12,
    "Jumam" => 52,
    "Romano" => 33,
    "Ediscleia" => 55,
];

// crescente
asort($arr);
print_r($arr);
echo "<br>";

$arr2 = [
    "Jeca" => 12,
    "Jumam" => 52,
    "Romano" => 33,
    "Ediscleia" => 55,
];

// decresente
arsort($arr2);
print_r($arr2);
echo "<br>";

// AGORA COM CHAVES

// crescente
ksort($arr2);
print_r($arr2);
echo "<br>";


// decrescente
krsort($arr2);
print_r($arr2);
echo "<br>";

// --- EXERCÍCIO 51 ---
echo "<br> --- EXERCÍCIO 51 ---<br>";

$arrExerc = [
    "Velcro" => 8.5,
    "Mayo" => 7.6,
    "Denai" => 6,
    "Verani" => 9.5,
    "Tchusgo" => 9.0
];

?>

<h1>Lista de aprovados:</h1>
    <ol>
        <?php arsort($arrExerc); foreach($arrExerc as $nome => $nota): ?>
        <li><?= $nome . "  ->  "   . $nota ?></li>
        <?php endforeach ?>
    </ol>


