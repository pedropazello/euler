// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?
import java.util.*;

class Problem3 {

    public static boolean isPrime(int n) {
        int res = 0;
        int err = 0;
        for(int x = 2; x < n; x++) {
           res = n % x;
           if(res == 0)
               err++;
        }
        if(err > 0)
            return false;
        else
            return true;
    }

    public static List<Integer> generatePrimes(int amnt) {
        List<Integer> primes = new ArrayList<Integer>();
        for(int x = 1; x < amnt; x++) {
            if(isPrime(x))
                primes.add(x);
        }
        return primes;
    }

    public static int largestPrime(Long num) {
        List<Integer> primes = generatePrimes(100000);
        List<Integer> primesUsed = new ArrayList<Integer>();
        int x = 0;
        Long quo = 0L;
        while(quo != 1) {
            Long res = (Long) (num % primes.get(x));
            if(res == 0L) {
                quo = (Long) (num / primes.get(x));
                num = (Long) (num / primes.get(x));
                primesUsed.add(primes.get(x));
            }
            x++;
        }

        int large = 0;
        for(int y = 0; y < primesUsed.size(); y++) {
            if(primesUsed.get(y) > large)
                large = primesUsed.get(y);
        }
        return large;
    }

    public static void main(String[] args) {
        System.out.println(largestPrime(600851475143L));
    }
}
