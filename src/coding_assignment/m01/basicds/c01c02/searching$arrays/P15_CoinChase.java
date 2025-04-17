package coding_assignment.m01.basicds.c01c02.searching$arrays;

import java.util.ArrayList;

public class P15_CoinChase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Coin Chase on Main Street
//		In the lively town of Main Street, two HeyCoach students, Ram and Shyam, embarked on an intriguing challenge. Tasked by their mentor, they ventured onto a straight road lined with an even number of buildings. Each building held a stash of gold coins, but here's the twist – certain buildings were occupied by cunning thieves who could pilfer coins from their pockets.
//
//		Ram kicked off the adventure from the 0th building, while Shyam began at the (n-1)th building, both determined to maximize their gold haul. Guided by their mentor's strategy, they aimed to visit n/2 buildings, ensuring they'd eventually meet in the middle.
//
//		You have to return an array of size n/2 where ith index would denote who has the maximum number of coins collected at ith time.
//
//		if Ram has maximum coins answer would be 1, -1 if Shyam has maximum coins, 0 if both have same number of coins.
//
//		Example 1
//
//		Input:
//		[1,2,-1,4,-1,1]   
//		Output:
//		[0,1,-1]
//		Explanation:
//		At moment 1 Ram will have 1 coin and Shyam will have 1 coin thus the output would be 0 at zeroth index. The next moment Ram will have 2+1 coin which in total is 3 and Shyam will have -1+1=0 coin and that's why the output for the next index would be 1 (Ram has more coins than Shyam). Then at the next moment Ram will have 3-1 = 2 coins and Shyam would have 0+4=4 coins and since Shyam has more coins the output for that should be -1. They have now covered all the houses so, return the output as array which in this case is: [0 1 -1].
//
//		Example 2
//
//		Input:
//		[1,-1]   
//		Output:
//
//		  [1]
//		Example 3
//
//		Input:
//		  [2,2,2,2]   
//		Output:
//		[0,0]
//		Constraints
//
//		2 <= n <= 200000
//
//		n is even
//
//		-1e^9 <= coins[i] <= 1e^9
		
		ArrayList<Integer> coins = new ArrayList<>();
		coins.add(1);
		coins.add(2);
		coins.add(-1);
		coins.add(4);
		coins.add(-1);
		coins.add(1);
		System.out.println(coinChase(coins));

	}

	public static ArrayList<Integer> coinChase(ArrayList<Integer> coins) {

		int n = coins.size();
		ArrayList<Integer> res = new ArrayList<>();
		int ram = 0;
		int shyam = 0;
		for (int i = 0; i < n / 2; i++) {
			ram += coins.get(i);
			shyam += coins.get(n - i - 1);
			if (ram > shyam) {
				res.add(1);
			} else if (ram < shyam) {
				res.add(-1);
			} else {
				res.add(0);
			}
		}
		return res;

	}

}
