package Easy.Array;

class TwoSum {

    public int[] twoSum(int[] nums, int target){

        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        System.out.println("Indices of the two numbers that add up to target:" + target);
        System.out.println("Index 1: " + result[0]);
        System.out.println("Index 2: " + result[1]);
    }
    public int removeDuplicates(int[] nums1) {
        return 0;
    }
}