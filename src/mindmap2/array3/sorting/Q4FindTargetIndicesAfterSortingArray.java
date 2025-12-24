package mindmap2.array3.sorting;

import java.util.ArrayList;
import java.util.List;

public class Q4FindTargetIndicesAfterSortingArray {


    public static void main(String[] args) {
        int[] arr = {11,12,12,13,14,2,2,1,1};
        int target = 2;
        List<Integer> result = findTargetIndicesAfterSorting1(arr, target);
        System.out.println("Indices of target " + target + " after sorting: " + result);
    }

    public static List<Integer> findTargetIndicesAfterSorting(int[] arr, int target) {
        // Sort the array
        java.util.Arrays.sort(arr);
        List<Integer> indices = new java.util.ArrayList<>();

        // Find indices of the target element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                indices.add(i);
            }
        }
        return indices;

    }

    public static List<Integer> findTargetIndicesAfterSorting1(int[] nums, int target) {
        // Sort the array
        int num=0,tcount=0;
        for(int ele:nums){
            if(ele==target){
                tcount++;
            }
            else if(ele<target){
                num++;
            }
            System.out.println("ele: " + ele + " num: " + num + " tcount: " + tcount);
        }
        List<Integer> ans=new ArrayList<>();
        while(tcount>0){
            ans.add(num);
            num++;
            tcount--;
        }
        return ans;    }

}
