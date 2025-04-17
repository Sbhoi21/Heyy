package f_stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class A132_pattern_456 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = { 1, 2, 3, 2 };
//		[-1,3,2,0]
		int[] nums = { -1, 3, 2, 0 };
		System.out.println(find132pattern(nums));
	}

	public static boolean find132pattern(int[] nums) {
		int vk = -(1 << 30);
		System.out.println(vk);
		Deque<Integer> stk = new ArrayDeque<>();
		for (int i = nums.length - 1; i >= 0; --i) {
			if (nums[i] < vk) {
				return true;
			}
			while (!stk.isEmpty() && stk.peek() < nums[i]) {
				vk = stk.pop();
			}
			stk.push(nums[i]);
        }
		return false;
	}

}
