package coding_assignment.m01.basicds.c01c02.searching$arrays;

import java.util.List;

public class P11_MoveTwos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Can you move two's?
//		Given an integer array nums, move all 2's to the end of it while maintaining the relative order of the non-zero elements. Note that you must do this in-place without making a copy of the array.
//
//		You don't need to return anything in the function just perform inplace operations.
//
//		Example
//		Input :
//		arr = [2,2,1]
//
//		Output :
//		[1,2,2]
//
//		Constraints:
//		1 <= arr.length <= 4 * 10^4
//
//		0 <= arr[i] <= 10^9

		int[] arr = { 2, 2, 1 };
		moveTwos(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void moveTwos(int[] arr) {
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 2) {
				arr[count++] = arr[i];
			}
			System.out.println(count);
		}
		while (count < n) {
			arr[count++] = 2;
		}
	}

	public static void moveTwos(List<Integer> arr) {

		int n = arr.size();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr.get(i) != 2) {
				arr.set(count++, arr.get(i));
			}
		}
		while (count < n) {
			arr.set(count++, 2);
		}

	}
	// psudo code
//	public void function() {

//	    slow and fast pointer... 
//	    slow will increase when there is no 2 and fast will increase by default
//      when fast is not 2 then add in arr[slow] and increment slow
//      add 2 in remaining indexes

//		count = 0;
//		
//		loop : 0 to n
//            if arr[i] != 2
//                add in arr[count] and increment count
//                otherwise only i will increase by default
//        end loop
//        
//        loop : count to n
//        	   add 2 in remaining indexes
//        end loop
//		
//	}

}
