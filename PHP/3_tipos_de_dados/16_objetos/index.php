<?php

class Pessoa {

    function falar() {
        echo "Olá";
    }
}

$pessoa1 = new Pessoa();

$pessoa1->nome = "Adroaldo";

echo $pessoa1->nome;
echo "<br>";

$pessoa1->falar();
echo "<br>";

?>