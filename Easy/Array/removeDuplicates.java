package Easy.Array;

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueCount - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();

        int[] num1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(num1);
        System.out.println("Output: " + k1);
        for (int i = 0; i < k1; i++) {
            System.out.print(num1[i] + " ");
        }
        System.out.println();

        int[] num2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = solution.removeDuplicates(num2);
        System.out.println("Output: " + k2);
        for (int i = 0; i < k2; i++) {
            System.out.print(num2[i] + " ");
        }
        System.out.println();
    }
}
