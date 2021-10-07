<?php

class Human { 

}

class Animal { 

}

class Professor extends Human { 

}

$malcom = new Human;

$turi = new Animal;

$professor = new Professor;

if($malcom instanceof Human){
    echo "Malcom é um humano <br>";
} else { 
    echo "Malcom não é um humano <br>";
}

if($turi instanceof Human){
    echo "Turi é um humano <br>";
} else { 
    echo "Turi não é um humano <br>";
}

if($professor instanceof Human){
    echo "Professor é um humano <br>";
} else { 
    echo "Professor não é um humano <br>";
}

if($professor instanceof Professor){
    echo "Professor é um PROFESSOR <br>";
} else { 
    echo "Professor não é um PROFESSOR <br>";
}
