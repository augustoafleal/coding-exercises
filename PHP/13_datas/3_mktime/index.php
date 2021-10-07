<?php

$dataNascimento = mktime(02, 12, 33, 02, 15, 1992);

echo $dataNascimento . "<br>";

$dataNascimentoFormatada = date('d/m/Y', $dataNascimento);

echo $dataNascimentoFormatada . "<br>";

echo date('m/d/Y', mktime(10, 20, 11, 04, 29, 2041)) . "<br>";