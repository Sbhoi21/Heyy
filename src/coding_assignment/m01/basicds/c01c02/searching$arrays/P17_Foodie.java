package coding_assignment.m01.basicds.c01c02.searching$arrays;

public class P17_Foodie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Foodie
//		There are n food stations along a circular route, where the amount of food at the ith station is food[i].
//
//		You have a body with an unlimited storage capacity for food, and it costs cost[i] of food to travel from the ith station to its next (i + 1)th station. You begin your journey with an empty stomach at one of the food stations.
//
//		Given two integer arrays food and cost, return the starting food station's index if you can travel around the circuit once in the clockwise direction without running out of food, otherwise return -1. If there exists a solution, it is guaranteed to be unique.
//
//		Example 1:
//
//		Input:
//		food = [1,2,3,4,5], cost = [3,4,5,1,2]
//
//		Output :
//		3
//
//		Example 2:
//
//		Input :
//		food = [2,3,4], cost = [3,4,3]
//
//		Output:
//		-1
//
//		Constraints:
//
//		n == food.length() == cost.length()
//
//		2 <= n <= 200000
//
//		0 <= food[i], cost[i] <= 10000

		int[] food = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };
		System.out.println(foodie(food, cost));

		int[] food1 = { 2, 3, 4 };
		int[] cost1 = { 3, 4, 3 };
		System.out.println(foodie(food1, cost1));

	}

	public static int foodie(int[] food, int[] cost) {
		int n = food.length;
		int total = 0;
		int sum = 0;
		int start = 0;
		for (int i = 0; i < n; i++) {
			total += food[i] - cost[i];
			sum += food[i] - cost[i];
			if (sum < 0) {
				start = i + 1;
				sum = 0;
			}
		}
		return total >= 0 ? start : -1;
	}

}
