<?php

// Não imprimirá nada:
echo NULL;

$nome = NULL;

if(is_null($nome)){
    echo "O valor é nulo. --- 1";
}

$nome = "Aylson";


if(is_null($nome)){
    echo "O valor é nulo. --- 2";
}


?>