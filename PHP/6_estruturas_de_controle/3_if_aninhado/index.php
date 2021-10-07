<?php

if (10 > 2) {
    echo "Entrou no primeiro if <br>";

    if("teste" === "teste"){
        echo "Entrou no segundo if <br>";
    }

}

if (10 > 2) {
    echo "Entrou no primeiro if <br>";

    $escopo2 = 20;

    if("teste" === "teste"){
        
        echo "Entrou no segundo if <br>";
        
        echo $escopo2;

    } else { 
        echo "Entrou no segundo else <br>";
    }

} else { 
    echo "Entrou no primeiro else <br>";
}

// --- EXERCÍCIO 25 ---
echo "<br> --- EXERCÍCIO 25 --- <br>";

$num1 = 2;
$num2 = 400;
$num3 = 60;
$string1 = "20";
$string2 = "teste";


if(is_int($num1)){

    $num4 = $num1 * 2;

    if($num4 > 100){
        echo "Número maior que 100 / 1 <br>";
    } else { 
        echo "Número menor que 100 / 1 <br>";
    }
} else { 
    echo "Não é maior que 100 / 1 <br>";
}

if(is_int($num2)){
    $num5 = $num2 * 2;
    if($num5 > 100){
        echo "Número maior que 100 / 2 <br>";
    } else { 
        echo "Número menor que 100 / 2 <br>";
    }
}

if(is_int($num3)){
    $num6 = $num3 * 2;
    if($num6 > 100){
        echo "Número maior que 100 / 3 <br>";
    } else { 
        echo "Número menor que 100 / 3 <br>";
    }
}

if(is_int($string1)){
    $num7 = $string1 * 2;
    if($num6 > 100){
        echo "Número maior que 100 / 4 <br>";
    } else { 
        echo "Número menor que 100 / 4 <br>";
    }
}

if(is_int($string2)){
    $num8 = $string2 * 2;
    if($num6 > 100){
        echo "Número maior que 100 / 5 <br>";
    } else { 
        echo "Número menor que 100 / 5 <br>";
    }
} else { 
    echo "Não é um número inteiro. <br>";
}

