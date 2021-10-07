<?php

$arr = [
    "nome" => "Jugam",
    "idade" => 45
];

// COM ARRAY_KEY_EXISTS

if(array_key_exists("nome", $arr)){
    
    echo "A chave existe <br>";
    echo "$arr[nome] <br>";
}

// COM ISSET

if(isset($arr['nome'])){ 
    echo "A chave existe ISSET <br>";
}

