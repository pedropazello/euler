<?php
// If we list all the natural numbers below 10 that are
// multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.

function isMultiple($n) {
    if($n % 3 === 0) return true;
    if($n % 5 === 0) return true;
    else return false;
}

function findSum($limit) {
    $sum = 0;
    for($x = 1; $x < $limit; $x++)
        if(isMultiple($x)) $sum += $x;
    return $sum;
}

echo findSum(1000);
?>

