package Easy.Array;

import java.util.Arrays;

class Merge {

    public void merge(int[] nums1, int m, int[] nums2, int n){
        for(int j = 0, i = m; j<n; j++){
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        Merge solution = new Merge();

        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        for(int i : nums1){
            System.out.print(i + ",");
        }
        System.out.println();
    }
}