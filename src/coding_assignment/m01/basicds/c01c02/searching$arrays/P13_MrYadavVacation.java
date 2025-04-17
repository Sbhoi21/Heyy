package coding_assignment.m01.basicds.c01c02.searching$arrays;

public class P13_MrYadavVacation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Mr. Yadav's Vacation
//		Rajesh Yadav is a English teacher at school who deceived the school into giving him 'n' days off from the school. Yadav wanted to go to Kerala with his daughters, so he wants to allocate several consecutive days to enjoy the holidays. Since he wants to make the best use of his time thus requiring careful preparation, he will only go for at least 'k' days.
//
//		You are given an array 'Weather' containing the weather forecast (That is temperature on the i-th day) in Kerala. Temperature is in degrees. Mr. Yadav was born in Himachal, so he can go on vacation only if the temperature does not rise above 't' degrees throughout his trip. He asks you to help him and count the number of ways to choose vacation dates in Kerala.
//
//		Example:
//		Input: n = 3 , k = 1, t = 15
//		Weather = [-5,0,-10]
//		Output: 6
//
//		Explanation : 
//		In this example Mr. Yadav can go on these suitable dates [1], [2], [3], [1, 2], [2, 3], [1, 2, 3] which is equal to 6.
//
//		Constraints:
//		1 ≤ n ≤ 10^5
//		1 ≤ k ≤ n
//		−100 ≤ t ≤ 100

		int n = 3;
		int k = 1;
		int t = 15;
		int[] weather = { -5, 0, -10 };
		System.out.println(mrYadavVacation(n, k, t, weather));

		int n1 = 5;
		int k1 = 2;
		int t1 = 10;
		int[] weather1 = { 10, 20, 30, 40, 50 };
		System.out.println(mrYadavVacation(n1, k1, t1, weather1));

	}

	public static int mrYadavVacation(int n, int k, int t, int[] weather) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			int temp = 0;
			for (int j = i; j < n; j++) {
				if (weather[j] <= t) {
					temp++;
				} else {
					break;
				}
				if (temp >= k) {
					count++;
				}
			}
		}
		System.out.println(count);
		return count;
	}

}
