package classroom;

public class MergeRods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// merge the rods into single rod with minimum cost
		int n = 8;

		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
		
//		MergeRods mr = new MergeRods();
//		mr.mergeRods(arr);
		mergeRods(arr);
	}
	
	public static int mergeRods(int[] arr) {
		// sort the array
		int n = arr.length;
		int[] sortedArr = new int[n];
		
		
		// merge the rods
		
		
		
		// calculate the cost
		return 0;
	}


}


class test {

	public static double add(double a, double b) {
		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
		double number2 = 0.0;
		MergeRods.mergeRods(arr);
		try {
			number2 = a + b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return number2;
	}
	
}
