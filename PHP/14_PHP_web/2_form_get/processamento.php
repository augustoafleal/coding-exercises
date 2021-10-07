<?php
    
    if(isset($_GET['nome'])){
        $nome = $_GET['nome'];
        $idade = $_GET['idade'];
    } else { 
        $nome = "Padrão";
        $idade = "Padrão";
    }

  ?>

  <h1>O seu nome é <?= $nome ?></h1>
  <h2>A sua idade é <?= $idade ?></h2> 