<?php

$teste = "teste";
echo "$teste global 1 <br>";
if(5 > 2) { 
    $teste = "teste2";
    echo "$teste global 2 <br>";
}

// Criando variável local com o mesmo nome da variável global dentro de uma função 
function teste(){
    $teste = "xsd"; 
    echo "$teste local  <br>";
}

teste();

// Alterando variável global de dentro da função 
function testandoGlobal(){
    global $teste;
    $teste = 2;

    echo "$teste global funcao <br>";
}

testandoGlobal();
echo "$teste global 3 <br>";
