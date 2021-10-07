<?php

class Humano2 {

    public function falar(){
        echo "Olá";
    }

}

$ro = new Humano2;

$teste = 10;

if(is_object($ro)){
    echo "é um objeto <br>";
} else { 
    echo "não é um objeto <br>";
}

if(is_object($teste)){
    echo "é um objeto <br>";
} else { 
    echo "não é um objeto <br>";
}

echo get_class($ro) . "<br>";

if(method_exists($ro, "falar")){
    echo "método existe <br>";
} else { 
    echo "método não existe <br>";
}

if(method_exists($ro, "as")){
    echo "método existe <br>";
} else { 
    echo "método não existe <br>";
}