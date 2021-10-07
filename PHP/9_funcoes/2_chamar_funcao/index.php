<?php

// definir função
function soma(){
    echo 4 + 2 . "<br>";
}

// chamar função
soma();

// função do php
echo strtoupper("Testando função <br>");


// --- EXERCÍCIO 31 ---
echo "<br> --- EXERCÍCIO 31 --- <br>";

$arr31 = [
    "BMW",
    "MERCEDEZ BENZ",
    "FERRARI",
    "ALFA ROMEO"
];

$str31 = implode(", ", $arr31);

echo $str31;

// --- EXERCÍCIO 32 ---
echo "<br> --- EXERCÍCIO 32 --- <br>";

function funcMult($num1, $num2, $num3){
    echo $num1 * $num2 * $num3;
}

funcMult(3, 3, 3);

// --- EXERCÍCIO 32B ---
echo "<br> --- EXERCÍCIO 32B --- <br>";

function fullName($name, $lastName){
    echo $name . " " . $lastName;
}

fullName("Anastasia", "Genarinho");

