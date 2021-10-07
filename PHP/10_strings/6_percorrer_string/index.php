<?php

$str = "Esta é uma string grande com vários caracteres.";

for($i = 0; $i < strlen($str); $i++){

   // echo "$str[$i]<br>";
}

// --- EXERCÍCIO 40 ---
echo "--- EXERCÍCIO 40 --- <br>";

$str2 = "O rato roeu a roupa do rei de Roma";
$contador = 0;

for($i = 0; $i < strlen($str2); $i++){
    if($str2[$i] === "a"){
        $contador++;
    }
}

echo "O número de letras 'a' é: $contador <br>";

