// 2520 is the smallest number that can be divided by
// each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly
// divisible by all of the numbers from 1 to 20?


public class Problem5 {

    public static boolean isDivisible(int n) {
        int temp = 0;
        for(int x = 1; x <= 20; x++)
            if(n % x == 0) temp++;
        if(temp == 20) return true;
        else return false;
    }

    public static int smallestNumber() {
        int x = 1;
        while(true) {
            if(isDivisible(x)) break;
            x++;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(smallestNumber());
    }
}
