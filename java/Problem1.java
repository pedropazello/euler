// If we list all the natural numbers below 10 that are
// multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.

class Problem1 {

    public static boolean isMultiple(int n) {
        if(n % 3 == 0) return true;
        if(n % 5 == 0) return true;
        else return false;
    }

    public static int findSum(int limit) {
        int sum = 0;
        for(int x = 1; x < limit; x++)
            if(isMultiple(x)) sum += x;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(findSum(1000));
    }
}
