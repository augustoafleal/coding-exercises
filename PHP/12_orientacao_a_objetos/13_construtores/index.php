<?php

class Carro {

    public $portas;
    public $cor;
    public $marca;

    function __construct($portas, $cor, $marca){
      
        $this->portas = $portas;
        $this->cor = $cor;
        $this->marca = $marca;

    }

}

$ferrari = new Carro(4, "vermelha", "Ferrari");
echo "O carro é da marca $ferrari->marca, tem a cor $ferrari->cor e tem $ferrari->portas portas. <br>";

$bmw = new Carro(2, "preta", "BMW");
echo "O carro é da marca $bmw->marca, tem a cor $bmw->cor e tem $bmw->portas portas. <br>";

// --- EXERCÍCIO 57 ---
echo "<br><br> --- EXERCÍCIO 57 --- <br><br>";

class Cachorro {

    public $raca;
    public $cor;
    public $idade;
    public $nome;

    function __construct($raca, $cor, $idade, $nome){
    
        $this->raca = $raca;
        $this->cor = $cor;
        $this->idade = $idade;
        $this->nome = $nome;
     
    }

    public function apresentacao(){
        echo "$this->nome é um cachorro da raça $this->raca, 
            tem $this->idade anos e é da cor $this->cor. <br>";
    }
}

$jimi = new Cachorro("Pastor Alemão", "preta", 12, "Jimi");
$jimi->apresentacao();