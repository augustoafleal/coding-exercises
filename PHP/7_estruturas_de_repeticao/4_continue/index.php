<?php
$a = 10;

while($a > 0) {

    echo "Executando o loop $a <br>";

    if($a == 5 || $a == 7){
        echo "Pulando uma execução $a <br>";

        $a--;

        continue;
    } 

    if($a == 2) { 
        echo "Interrompendo loop <br>";

        break;
    }

    $a--;

}

// --- EXERCÍCIO 29 ---
echo "<br> --- EXERCÍCIO 29 --- <br>";

$arr = [];
$contador = 0;
$incremento = 10;

while($contador < 10){
    $arr[$contador] = $incremento;
    $incremento += 10;
    $contador++;
}

print_r($arr);
$contador2 = 0;

while($contador2 < count($arr)){

    $numeroAtual = $arr[$contador2];

    if($numeroAtual == 30 || $numeroAtual == 40){
        $contador2++;
        continue;
    }
    echo $numeroAtual . "<br>";
    $contador2++;
    
} 
