<?php

$pessoa1 = [
    "nome" => "Rayon",
    "idade" => 38,
    "profissao" => "torneiro"
];

$pessoa2 = [
    "nome" => "Toya",
    "idade" => 31,
    "profissao" => "gerente"
];

foreach($pessoa1 as $carac => $value){

    echo "$carac => $value <br>";
}


// SOMENTE COM O VALOR 

foreach($pessoa2 as $value){

    echo "$value <br>";

}
?>

<?php
// --- EXERCÍCIO 50 ---
echo "<br> --- EXERCÍCIO 50 --- <br>";

$arrExer = [
    "nome" => "Ágora",
    "idade" => 25,
    "profissao" => "estudante",
    "nacionalidade" => "brasileiro"
];

echo "<table>";

// TABLE HEAD

foreach($arrExer as $carac => $value){

    echo "<th>" . $carac . "</th>";
    
}

// TABLE BODY

echo "<tr>";

foreach($arrExer as $carac => $value){

    echo "<td>" . $value . "</td>";    
    
}

echo "</tr>";

echo "</table>";

echo "<br><br> --- RESOLUÇÃO DO PROFESSOR --- <br><br>";
?>

<?php

$pessoasExer = [

    "Joa" => 21,
    "Joka" => 45,
    "Faixo" => 12,
    "Vilco" => 98

];

?>

<table border ="1">
    <tr>
        <th>Nome</th>
        <th>Idade</th>
    </tr>
    <?php foreach($pessoasExer as $nome => $idade): ?>
        <tr>
            <td><?= $nome ?></td>
            <td><?= $idade ?></td>
        </tr>
    <?php endforeach; ?>
</table>


   