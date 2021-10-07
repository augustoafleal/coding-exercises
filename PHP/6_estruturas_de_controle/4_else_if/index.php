<?php

if (10 == 5) {
    echo "Entrou no if <br>";
} else if (10 > 6){
    echo "Entrou no else if <br>";
} else { 
    echo "Entrou no else <br>";
}

if (10 == 5) {
    echo "Entrou no if <br>";
} else if (10 < 6){
    echo "Entrou no else if 1 <br>";
} else if (11 > 1){
    echo "Entrou no else if 2 <br>";
} else { 
    echo "Entrou no else <br>";
}

// --- EXERCÍCIO 26 ---
echo "<br> --- EXERCÍCIO 26 --- <br>";

$vel1 = 50;
$vel2 = 30;

if($vel1 < 40) { 
    echo "Velocidade correta <br>";
} else if($vel1 == 40) { 
    echo "Atenção! <br>";
} else { 
    echo "Velocidade acima do permitido. <br>";
}

if($vel2 < 40) { 
    echo "Velocidade correta <br>";
} else if($vel2 == 40) { 
    echo "Atenção! <br>";
} else { 
    echo "Velocidade acima do permitido. <br>";
}

