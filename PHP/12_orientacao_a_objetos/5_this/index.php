<?php

class Animal{

    public $nome;

    function escolherNome ($nome){
    $this->nome = $nome;
    }

    function latir(){
        return "$this->nome está latindo <br>";
    }

    function latirForte(){
        return strtoupper($this->latir() . "muito forte"); 
    }
}

$frida = new Animal;
echo "O nome do animal é $frida->nome <br>"; // Vai imprimir em branco
$frida->escolherNome("Frida");
echo "O nome do animal é $frida->nome <br>";
echo $frida->latir();
echo $frida->latirForte();

// --- EXERCÍCIO 53 ---
echo "--- EXERCÍCIO 53 --- <br>";

class Car{
    
    public $marca;
    public $cor;
    public $velocidadeMaxima;

    function setVelocidadeMaxima($velocidadeMaxima){
        $this->velocidadeMaxima = $velocidadeMaxima;
    }

    function getVelocidadeMaxima(){
        return "A velocidade máxima deste carro é: $this->velocidadeMaxima km/h <br>";
    }
}


// CARRO 1
$fiat = new Car;
$fiat->marca = "Fiat";
$fiat->cor = "vermelho";
$fiat->velocidadeMaxima= "110";
$fiat->setVelocidadeMaxima(240);
echo $fiat->velocidadeMaxima . "<br>";
echo $fiat->getVelocidadeMaxima() . "<br>";

// CARRO 2
$bmw = new Car;
$bmw->marca = "BMW";
$fiat->cor = "preto";
$fiat->setVelocidadeMaxima(360);
echo $fiat->velocidadeMaxima . "<br>";
echo $fiat->getVelocidadeMaxima() . "<br>";
