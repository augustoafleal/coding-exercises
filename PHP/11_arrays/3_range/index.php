<?php

$arr = range(1, 10);

print_r($arr);

echo "<br>";

$arr2 = range(5, 100, 10);

print_r($arr2);

// --- EXERCÍCIO 45 ---
echo "<br> --- EXERCÍCIO 45 --- <br>";

$arrExerc = range(10, 45);

foreach($arrExerc as $item){
    echo "<br>" . $item + 6 . "<br>";
    if($item + 6 > 30){ 
        echo "O número é muito alto <br>";
    }
}

