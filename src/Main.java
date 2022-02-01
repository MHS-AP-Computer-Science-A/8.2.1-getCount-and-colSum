
public class Main {
	public static void main(String[] args) {
		// You can change the values to test your methods
		int[][] testArray = { { 6, 5, 6 }, { 0, 3, 2 }, { 6, 7, 4 }, { 5, 1, 3 } };
		int[][] testArray2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		// 8.2.1 Testing getCount
		System.out.println("6 occurs in testArray " + getCount(testArray, 6) + " times.");
		System.out.println("16 occurs in testArray2 " + getCount(testArray2, 16) + " times.");

		// 8.2.2 Testing colSum
		System.out.println("The sum of column 2 is: " + colSum(testArray, 0));
		System.out.println("The sum of column 2 is: " + colSum(testArray2, 3));

	}

	// POST: Computes and returns the number of times element
	// occurs in arr
	public static int getCount(int[][] arr, int element) {
		// Complete this method

		return 0;
	}
	
	//POST: Computes and returns the sum of column col
	public static int colSum(int[][] arr, int col) {
		// Complete this method

		return 0;        
	}
}
