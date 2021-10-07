<?php

$x = 0;

while($x < 10){
    echo "O X é $x <br>";
    
    if($x === 5){
        echo "Terminando o loop <br>";
        break;
    } else { 
        echo "Ainda não terminou <br>";
    }
 
    $x++;
}

// --- EXERCÍCIO 28 ---
echo "<br> --- EXERCÍCIO 28 --- <br>";

$contador = 4;

while ($contador <= 30){
    echo $contador . "<br>";
    
    if($contador == 24){ 
        echo "Interrompendo loop. <br>";
        break;
    }

    $contador += 2;
}