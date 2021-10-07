<?php

interface Caracteristicas {

    const NOME = "Hugh"; 
    public function falar();

}

class Human implements Caracteristicas {

    public $idade = 99;
    public function falar(){
        echo "Olá mundo <br>";
    }

    public function dizerNome(){
        echo "Meu nome é " . self::NOME . "<br>";
    }
}

$hugh = new Human;
$hugh->falar();
$hugh->dizerNome();

