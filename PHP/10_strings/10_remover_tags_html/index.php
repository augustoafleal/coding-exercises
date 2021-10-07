<?php

$strHtml = "<p> Testando parágrafo.</p><div>Uma div</div><p>Outro parágrafo</p>"; 

echo $strHtml;

echo "AGORA EM TEXTO PURO <br>";

$salvarTextoBanco = strip_tags($strHtml);

echo $salvarTextoBanco;