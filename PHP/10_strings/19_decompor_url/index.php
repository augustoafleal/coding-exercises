<?php

$url = "https://www.google.com";

$arrayUrl = parse_url($url);

print_r($arrayUrl);
echo "<br>";

echo $arrayUrl["host"];
echo "<br>";

$url2 = "https://www.google.com/search?q=gremio&oq=gremio&aqs=chrome..69i57j0i433i512l2j0i512j0i131i433i512j0i512j69i61l2.1045j1j7&sourceid=chrome&ie=UTF-8";

$arrayUrl2 = parse_url($url2);

print_r($arrayUrl2);
