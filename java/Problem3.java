// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?
import java.util.*;

class Problem3 {

    public static int largestPrime(Long num) {
        int large = 0;
        int x = 1;
        Long quo = 0L;
        while(quo != 1) {
            Long res = (Long) (num % x);
            if(res == 0L) {
                quo = (Long) (num / x);
                num = (Long) (num / x);
                large = x;
            }
            x++;
        }
        return large;
    }

    public static void main(String[] args) {
        System.out.println(largestPrime(600851475143L));
    }
}
