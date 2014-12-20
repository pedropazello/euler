class Problem7 {
    static boolean isPrimeNumber(int n) {
        int mod = 0;
        int divisor = 1;
        int flag = 0;
        while(divisor <= n) {
            mod = n % divisor;
            if(mod == 0 && divisor > 1 && divisor < n)
                flag++;
            divisor++;
        }
        if(flag == 0)
            return true;
        else
            return false;
    }
    static int xPrimeNumber(int x) {
        int lastPrime = 0;
        int i = 2;
        int primeCounter = 0;
        while(primeCounter != x) {
            if(isPrimeNumber(i)) {
                lastPrime = i;
                primeCounter++;
            }
            i++;
        }
        return lastPrime;
    }
    public static void main(String[] args) {
        System.out.println(xPrimeNumber(10001));
    }
}
