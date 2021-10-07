<?php

class Humanos {

    public $nome;
    public $idade;
    public $profissao;

    // public function falar(){}

    // public function andar(){}
}

if(class_exists("Humanos")){

    echo "A classe existe <br>";

}
if(class_exists("Cachorro")){

    echo "A classe existe <br>";

} else { 

    echo "A classe não existe <br>";

}

print_r(get_class_vars("Humanos"));

print_r(get_class_methods("Humanos"));
