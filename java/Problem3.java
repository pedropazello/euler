// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?

class Problem3 {

    public static Long largestPrime(Long num) {
        Long large = 0L;
        int x = 1L;
        Long quo = 0L;
        while(quo != 1) {
            Long res = num % x;
            if(res == 0L) {
                quo = num / x;
                num = num / x;
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
