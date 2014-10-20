# If we list all the natural numbers below 10 that are
# multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
# Find the sum of all the multiples of 3 or 5 below 1000.

def is_multiple(n)
    if n % 3 == 0
        return true;
    end
    if n % 5 == 0
        return true;
    else
        return false;
    end
end

num = (1..999).select { |e| is_multiple(e) }
sum = 0
num.each {|e| sum += e}
puts sum
