<?php

class Car {

    public $rodas = 4;
    private $vidro = "Sem película";
    protected $portas = 4;
    
    // public function peliculaDeFabrica($pelicula){

       // $this->vidro = $pelicula;
    // }
    
    public function getVidro(){

        return $this->vidro;
    }
    
    public function getPortas(){

        return $this->portas;
    }
}

class Mecanico {

    public function alterarRodas($carro){
        $carro->rodas = 10;
    }

    public function colocarPelicula($carro, $pelicula){
        $carro->vidro = $pelicula;
    }

}
$carro = new Car;
echo $carro->rodas . "<br>";

$mercio = new Mecanico;
$mercio->alterarRodas($carro) . "<br>";

echo $carro->rodas . "<br>";

// Não pode alterar com a função abaixo porque é privado
//$mercio->colocarPelicula($carro, "G20");


echo $carro->getVidro() . "<br>";

echo $carro->getPortas() . "<br>";