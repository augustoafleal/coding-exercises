<?php

class Pessoa { 

    function falar(){
        echo "Olá, eu sou um objeto. <br>";
    }
    
    function somar($x, $y){
        echo $x + $y . "<br>";
    }
}

$tercio = new Pessoa;
$tercio->falar();
$tercio->somar(6, 6);

$arrudao = new Pessoa;
$arrudao->falar();
$arrudao->somar(2, 2);

// --- EXERCÍCIO 53 ---
echo "--- EXERCÍCIO 53 --- <br>";

class Cachorro{

    function latir(){
        echo "AUAU <br>";
    }

    function andar($a = 5){
        echo "Andando..." . $a . "metros <br>";
    }
}

$birobiro = new Cachorro;
$birobiro->latir();
$birobiro->andar(2);

$vavo = new Cachorro;
$vavo->latir();
$vavo->andar();