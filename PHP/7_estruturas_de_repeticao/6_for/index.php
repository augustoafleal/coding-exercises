<?php

// CONTADOR; CONDIÇÃO; INCREMENTO/DECREMENTO

for($i = 0; $i < 10; $i++){

    if($i == 4){
        echo "No quatro! <br>";
    }

    if($i == 8){
        break;
    }

    echo "Testando for $i <br>";

}

// --- EXERCÍCIO 30 ---
echo "<br> --- EXERCÍCIO 30 --- <br>";

$arr = [];

for($i = 1; $i < 21; $i++){
    $arr[$i] = $i;
}

print_r($arr);
echo "<br><br><br>";

for($i = 1; $i < count($arr); $i++){

    if($arr[$i] % 2 == 0){
        echo "<br> $arr[$i] <br>";
    }

}

// --- EXERCÍCIO 30B ---
echo "<br> --- EXERCÍCIO 30B --- <br>";

$arr2 = [];

for($i = 1; $i <= 10; $i++){
    
    array_push($arr2, $i);

}

print_r($arr2);
echo "<br>";

// --- EXERCÍCIO 30C ---
echo "<br> --- EXERCÍCIO 30C --- <br>";

$arr3 = [];

for($i = 10; $i <= 20; $i++){

    array_push($arr3, $i);

}

print_r($arr3);

for($i = 0; $i < count($arr3); $i++){

    if($arr3[$i] % 2 != 0){
        echo "Número - $arr3[$i] <br>";
    }

}