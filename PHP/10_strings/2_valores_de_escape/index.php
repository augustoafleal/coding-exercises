<?php

// Função paraque o HTML não interfira na exibição do php puro:

header("Content-type: text/plain");

// Pular linha
echo "Primeira linha \n  Segunda linha \n";

// Tab
echo "Testando o tab \t aqui \n";

// Barra invertida
echo "Barra invertida \\ \n";

// Sinal dólar
echo "Inserindo o dólar \$ \n";
