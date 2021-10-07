<?php

$a = (int) "12";

echo $a;
echo "<br>";
echo $a + 10;
echo "<br>";

if(is_int($a)){
    echo "É integer. <br>";
}

$b = (float) "3.141512";

if(is_float($b)){
    echo "É float <br>";
}