<?php

// --- OPERAÇÕES DE COMPARAÇÃO --- 
echo "<br> OPERAÇÕES DE COMPARAÇÃO <br>";

if(3 == 3) {
    echo "Comparação verdadeira. <br>";
}

if(3 == 4) {
    echo "Comparação verdadeira 2. <br>";
}

$nome = "Nome";
$nomeDoSistema = "Nome";

if($nome == $nomeDoSistema){
    echo "Comparação de nome coincide. <br>";
}

// Exercício 15

if((3 + 2) == 5){
    echo "Operação correta 1 / exercício 15. <br>";
}

if((3 + 2) == 2){
    echo "Operação correta 2 / exercício 15. <br>";
}

// --- OPERAÇÕES DE IDÊNTICO A --- 
echo "<br> OPERAÇÕES DE IDÊNTICO A <br>";

if(5 === 5){
    echo "5 é igual a 5. <br>";
}

// Esse não vai funcionar, pois "5" é string
if(5 === "5"){ 
    echo "5 é igual a 5. <br>";
}

// --- OPERADOR DE DIFERENÇA ---
echo "<br> OPERADOR DE DIFERENÇA <br>";

$a = 3;
$b = 4;

if($a != $b){
    echo "Testando a diferença <br>";
}

if($a != 3){
    echo "Testando a diferença <br>";
}

// --- OPERADOR NÃO IDÊNTICO A ---
echo "<br> OPERADOR DE NÃO IDÊNTICO A <br>";

$a = 1; // É um integer
$b = "1"; // É uma string

if ($a !== $b) { 
    echo "Não é idêntico. <br>";
}

// --- EXERCÍCIO 16 ---
echo "<br> EXERCÍCIO 16 <br>";

$a = 5;
$b = 3;

if($a == $b){ 
    echo "São iguais. <br>";
}

if($a != $b){
    echo "São diferentes. <br>";
}

if($a === $b){
    echo "São idênticos. <br>";
}

if($a !== $b){
    echo "Não são idênticos. <br>";
}

// --- OPERADOR MAIOR A (OU) MAIOR OU IGUAL A  ---
echo "<br> OPERADOR MAIOR A (OU) MAIOR OU IGUAL A <br>";

$a = 4;
$b = 5;
$c = 6;
$d = 6;

if($a > $b) { 
echo "A é maior que B. <br>";
}

if($a < $b) { 
echo "A é menor que B. <br>";
}

if($b > $a) { 
echo "B é maior que A. <br>";
}

if($c >= $d) { 
echo "C é maior ou igual a D. <br>";
}





