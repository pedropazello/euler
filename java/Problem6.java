// The sum of the squares of the first ten natural numbers is,
//              1^2 + 2^2 + ... + 10^2 = 385
// The square of the sum of the first ten natural numbers is,
//           (1 + 2 + ... + 10)^2 = 55^2 = 3025
// Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class Problem6 {

	public static int diffBetweenSums() {
		int sumSquares = 0;
		for(int x = 1; x <= 100; x++) 
			sumSquares += (int)Math.pow(x, 2);;

		int sum = 0;
		for(int x = 1; x <= 100; x++)
			sum += x;

		return ((int)Math.pow(sum, 2)) - sumSquares;
	}

	public static void main(String[] args) {
		System.out.println(diffBetweenSums());
	}
}