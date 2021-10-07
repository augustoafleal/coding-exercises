<?php

if(is_string("Teste")) { 
    echo "É uma string 1<br>";
}

$str = "Teste 2";
$num = 12;

if(is_string($str)) { 
    echo "$str é uma string 3<br>";
}

if(is_string($num)) { 
    echo "É uma string 2<br>";
}

?>