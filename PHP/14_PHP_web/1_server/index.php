<?php

  print_r($_SERVER);

  echo "<br>";

  echo $_SERVER['GATEWAY_INTERFACE'] . "<br>";

  if($_SERVER['SERVER_NAME'] == 'localhost') { 
      
    echo "está acessando o localhost <br>";
  }