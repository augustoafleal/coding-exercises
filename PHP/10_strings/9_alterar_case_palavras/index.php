<?php

$str1 = "testando o case de uma palavra <br>";

// PRIMEIRA LETRA EM MAIÚSCULO
echo ucfirst($str1);

// CADA UMA DAS PALAVRAS COM A PRIMEIRA LETRA EM MAIÚSCULO
$str2 = "testando o case de uma palavra <br>";

echo ucwords($str2);

// --- EXERCÍCIO 41 ---
echo "--- EXERCÍCIO 41 --- <br>";

$strExercicio = "este item está em ";
$strExercicio2 = "promoção.";

echo ucfirst($strExercicio). strtoupper($strExercicio2);

