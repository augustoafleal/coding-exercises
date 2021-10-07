<?php

class Humano{
    public $idade = 29;

    public function falar(){
        echo "Olá Mundo!";
    }

    private function gritar(){
        echo "GRITANDO!";
    }

    public function acessarGritar(){
        $this->gritar();
    }

    protected function funcaoProtegida(){
        echo "Teste de função protegida.";
    }

    public function acessarFuncaoProtegida(){
        $this->funcaoProtegida();
    }
}

$pai = new Humano;
$pai->falar();
echo "<br>";
$pai->acessarGritar();
echo "<br>";
$pai->acessarFuncaoProtegida();
echo "<br>";

// CRIAÇÃO DE CLASSE HERDEIRA
class Programador extends Humano{

    function acessarGritarA(){
        $this->funcaoProtegida();
    }

}

$herdeiro = new Programador;
echo $herdeiro->idade . "<br>";
$herdeiro->falar();
echo "<br>";
$herdeiro->acessarGritar();
echo "<br>";
$herdeiro->acessarFuncaoProtegida();
echo "<br>";

// --- EXERCÍCIO 56 ---
echo "--- EXERCÍCIO 56 --- <br>";

class Human {
    
    protected $nome = "Adroveldo";
    public $planeta = "Terra";
    public $país = "Brasil";

    public function falar(){
        echo "$this->nome está falando <br>";
    }

}

class Professor extends Human{
   
    public $salario = 2000.21;

    function verNome(){
        return $this->nome;
    }

    function falarProfessor (){
        echo "$this->nome, professor, está falando <br>.";
    }
}

$jonas = new Professor;
echo $jonas->país . "<br>";
echo $jonas->planeta . "<br>";
echo $jonas->salario . "<br>";
echo $jonas->verNome() . "<br>";
echo $jonas->falarProfessor();
echo $jonas->falar();
