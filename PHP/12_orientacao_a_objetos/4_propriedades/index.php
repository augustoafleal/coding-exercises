<?php

class Car{

    public $rodas = 4;
    public $aro = 20;
    public $cor = "vermelha";

    function ligar(){
        echo "Ligado <br>";
    }

}

$ferrari = new Car;

echo $ferrari->aro . "<br>";
echo $ferrari->rodas . "<br>";
$ferrari->cor = "azul";
echo $ferrari->cor . "<br>";

$ferrari->ligar();


// --- EXERCÍCIO 53 ---
echo "--- EXERCÍCIO 53 --- <br>";


class Person {

    public $nome;
    public $idade;

    function andar(){
        
        echo "$this->nome está andando. <br>";
    }

}

// PESSOA 1
$jaimo = new Person;
$jaimo->nome = "Jaimo";
$jaimo->idade = 44;

echo "O nome é $jaimo->nome e a idade é $jaimo->idade.<br>";
$jaimo->andar(). "<br>";

// PESSOA 2
$tanos = new Person;
$tanos->nome = "Tanos";
$tanos->idade = 21;

echo $tanos->nome . "<br>";
echo $tanos->idade. "<br>";
$tanos->andar(). "<br>";
