<?php

$arr = [
    'caneta' => 32,
    'lapiseira' => 20,
    'borracha' => 2,
    'grafite' => 5,
    'estojo' => 45,
    'caderno' => 52
];

function itensCaros($arr){

    $arrCaros = [];

    foreach($arr as $item => $preco){
        if($preco > 10){
            array_push($arrCaros, $item);
        }
    }

    return $arrCaros;

}

$novoArray = itensCaros($arr);

print_r($novoArray);