<?php

$marca = "BMW";
$motor = "3.0";
$portas = 5;

$carro = compact("marca", "motor", "portas");

print_r($carro);

// --- EXERCÍCIO 49 ---
echo "<br> --- EXERCÍCIO 49 --- <br>";

$nome = "Rufus";
$raça = "Bengal";
$idade = 7;
$cor = "point color";

$arrAnimal = compact("nome", "raça", "idade", "cor");

foreach($arrAnimal as $caracs => $valor){
    
    echo "$caracs => $valor <br>";
    
}
