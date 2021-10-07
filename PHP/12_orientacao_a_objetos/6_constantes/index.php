<?php

class Human {

    public const OLHOS = 2;
    public const BRACOS = 2;
    public const PERNAS = 2;

    function mostrarConstante(){

        echo self::BRACOS . "<br>";
    }
}

$jelco = new Human;

echo $jelco::OLHOS . "<br>";

$jelco->mostrarConstante();