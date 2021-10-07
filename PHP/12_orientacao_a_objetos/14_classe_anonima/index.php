<?php

$pessoa = new Class(){

    public $nome = "Shark";

    public function dizerNome(){
        echo "Olá, meu nome é $this->nome <br>";
    }
};

echo $pessoa->nome . "<br>";

$pessoa->dizerNome();
