<?php

$pessoa = ["Adroaldo", 65, "Oficial", "verde"];

print_r($pessoa);
echo "<br>";

list($nome, $idade, $profissao, $corDosOlhos) = $pessoa;

echo "$nome <br>";
echo "$idade <br>";
echo "$profissao <br>";
echo "$corDosOlhos <br>";

// --- EXERCÍCIO 47 ---
echo "<br> --- EXERCÍCIO 47 --- <br>";

$carro = [
    "Jaguar",
    3.0,
    "azul",
    18,
    "Teto solar",
    "automático"
];

print_r($carro);
echo "<br>";

list($modelo, $portencia, $cor, $aro, $itemExtra, $cambio) = $carro;
list($modelo1, $portencia2) = $carro;

echo "$modelo <br>";
echo "$portencia <br>";
echo "$cor <br>";
echo "$aro <br>";
echo "$itemExtra <br>";
echo "$cambio <br>";
