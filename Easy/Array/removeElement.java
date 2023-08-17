package Easy.Array;

class RemoveElement {

    public int removeElement(int[] nums, int val){
        int idx = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        RemoveElement solution = new RemoveElement();

        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;

        int result1 = solution.removeElement(nums1, val1);
        System.out.println("Output: " + result1);
        for(int i = 0; i<result1; i++){
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;

        int result2 = solution.removeElement(nums2, val2);
        System.out.println("Output: " + result2);
        for(int i = 0; i<result2; i++){
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
    
}