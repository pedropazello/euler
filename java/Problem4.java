// A palindromic number reads the same both ways. The largest palindrome made from
// the product of two 2-digit numbers is 9009 = 91 × 99.
// Find the largest palindrome made from the product of two 3-digit numbers.


class Problem4  {

    public static boolean isPalindrome(int num) {
        int num2 = num, rev = 0;
        while(num2 > 0) {
            rev = rev * 10 + num2 % 10;
            num2 /= 10;
        }
        if(num == rev) return true;
        else return false;
    }

    public static int generatePalindrome() {
        int num = 0, large = 0;
        for(int x = 100; x < 1000; x++)
            for(int y = 100; y < 1000; y++) {
                num = y * x;
                if(isPalindrome(num)) if(num > large) large = num;
            }
        return large;
    }

    public static void main(String[] args)  {
        System.out.println(generatePalindrome());
    }
}
