<?php

$str= "Estamos testando o método strpos em strings, 
    com a possibilidade de com o método encontrar strings.";

$testeEncontrar = strrpos($str, "strings");

echo "$testeEncontrar <br>";

// EXTRAINDO PALAVRA

$palavra = substr($str, strpos($str, "strings"), 7);

echo $palavra . "<br>";