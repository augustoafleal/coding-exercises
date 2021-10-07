<?php

// --- OPERADOR AND  ---
echo "<br> OPERADOR AND <br>";

if(5 > 10 && 10 > 5){ // false e true
    echo "If 1 <br>";
}

if(50 > 10 && 10 > 5){ // true e true
    echo "If 2 <br>";
}

if((50 > 10 && 10 > 5) && 5 == 5){
    echo "If 3";
}

// --- EXERCÍCIO 17  ---
echo "<br> EXERCÍCIO 17 <br>";

if(15 > 5 && "João" === "João"){
    echo "if 1 / exercício 17 <br>";
}

if("teste" > 5 && 1){ // o 5 é convertido para string para ser comparado
    // número 1 é true, e 0 é false
    echo "if 2 / exercício 17 <br>";
}

if(2 == 3 && 5 >= 3){
    echo "if 3 / exercício 17 <br>";
}

// --- OPERADOR OR  ---
echo "<br> OPERADOR OR <br>";

if (5 > 2 || 30 < 4) { 
    echo "Apenas uma das operações é falsa. <br>";
}

if ("teste" === "nãoteste" || 30 < 4) { 
    echo "Duas operações são falsas. <br>";
}

if((2 > 1 || 2 < 1) && 2 === 2){
    echo "A operação resulta em true. <br>";
}

// --- EXERCÍCIO 18  ---
echo "<br> EXERCÍCIO 18 <br>";

if(12 < 5 || "João" === "João"){
    echo "Operação 1 - ex 18 <br>";
}

if(1 > 5 || 1){
    echo "Operação 2 - ex 18 <br>";
}

if(20 === "20" || 51 >= 31){
    echo "Operação 3 - ex 18 <br>";
}

// --- OPERADOR NOT  ---
echo "<br> OPERADOR NOT <br>";

if(!(5 > 20)) {
    echo "A operação 1 é verdadeira. <br>";
}
