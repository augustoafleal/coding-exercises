<?php

function velocidadeMaxima($vel){

    echo "O carro a velocidade máxima de $vel km/h. <br>";

}

velocidadeMaxima(200);
velocidadeMaxima(400);
velocidadeMaxima(600);



// PHP ignora os parâmetros desnecessários
// velocidadeMaxima(900, "teste");

function descreverAnimal($nome, $raça){
    echo "O $nome é da raça $raça <br>";
}

descreverAnimal("Bob", "vira-lata");
descreverAnimal("Shark", "pastor alemão");


// --- EXERCÍCIO 33 ---
echo "<br> --- EXERCÍCIO 33 --- <br>";

function apresentacao($nome, $idade, $genero){
    
    echo "Olá, eu sou $genero $nome e tenho $idade anos. <br>";
    
}

apresentacao("Cálcio", 29, "o");
apresentacao("Pelegué", 32, "a");

// --- EXERCÍCIO 34 ---
echo "<br> --- EXERCÍCIO 34 --- <br>";

function verificador($num){

    if($num % 2 == 0){
        echo "O número $num é par. <br>";
    } else {
        echo "O número $num é ímpar. <br>";
    }

}

verificador(33);
verificador(32);
verificador(32132137);
