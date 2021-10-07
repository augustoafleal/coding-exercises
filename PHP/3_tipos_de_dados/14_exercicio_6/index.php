<?php

$carro1 = [
    'marca' => 'Volswagen', 
    'modelo' => 'Gol', 
    'ano' => 2004, 
    'placa' => 'IWI1018',
    'teto_solar' => false
];

$carro2 = [
    'marca' => 'Mercedez Benz', 
    'modelo' => 'C1', 
    'ano' => 2021, 
    'placa' => 'IKL9090',
    'teto_solar' => true
];

print_r($carro1);
echo "<br>";
print_r ($carro2);
echo "<br>";

// Criando variáveis a partir dos elementos do array
$marca1 = $carro1['marca'];
$modelo1 = $carro1['modelo'];
echo "O carro é da marca $marca1 e do modelo $modelo1";
echo "<br>";

?>