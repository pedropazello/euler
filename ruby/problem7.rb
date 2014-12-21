def is_prime(n)
    divisor = 1
    div = 0
    counter = 0
    while divisor <= n
        div = n % divisor
        if div == 0 && divisor > 1 && divisor < n
            counter = counter + 1
        end
        divisor = divisor + 1
    end
    if counter == 0
        return true
    else
        return false
    end
end
def x_number_prime(x)
    last_prime = 0
    prime_counter = 0
    i = 2
    while prime_counter != x
        if is_prime(i)
            prime_counter = prime_counter + 1
            last_prime = i
        end
        i = i + 1
    end
    return last_prime
end
puts x_number_prime(10001)
