<?php

if(is_int(5)) {
    echo "É um inteiro <br>";
}

if(is_int("Não é inteiro")) {
    echo "Não é inteiro <br>";
}
$n = 10;

if(is_int($n)) {
    echo "É um inteiro - 3 <br>";
}

?>