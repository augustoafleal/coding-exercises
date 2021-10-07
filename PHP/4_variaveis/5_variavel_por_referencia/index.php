<?php

$x = 10;

$y =& $x;

echo $x;
echo "<br>";
echo $y;
echo "<br>";

echo "Após primeira troca de valor:";
$y = 15;
echo "<br>";
echo $x;
echo "<br>";
echo $y;
echo "<br>";

echo "Após segunda troca de valor:";
$x = 20;
echo "<br>";
echo $x;
echo "<br>";
echo $y;