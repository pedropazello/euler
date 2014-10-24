// 2520 is the smallest number that can be divided by
// each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly
// divisible by all of the numbers from 1 to 20?


public class Problem5 {

    public static int smallestNumber() {
        int i = 20;
        while(true) {
            if((i % 1 == 0) && (i % 2 == 0) && (i % 3 == 0) && (i % 5 == 0) &&
                (i % 7 == 0) && (i % 9 == 0) && (i % 11 == 0) && (i % 13 == 0) &&
                    (i % 16 == 0) && (i % 17 == 0) && (i % 19 == 0)) break;
            i += 20;
        }
        return i;
    }

    public static void main(String[] args) {
        // Class Timer.java found in Java Problems
        // Directory.
        Timer timer = new Timer("smallestNumber");
        System.out.println(smallestNumber());
        System.out.println(timer.runTime());
    }
}
