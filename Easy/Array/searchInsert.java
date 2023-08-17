package Easy.Array;

class SearchInsert {

    public int searchInsert(int[] nums, int target) {

        int h = nums.length - 1;
        int l = 0;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                h = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        SearchInsert insert = new SearchInsert();

        int[] nums = {1, 3, 5, 6};
        int target = 2;

        int result = insert.searchInsert(nums, target);

        System.out.println("Output: " + result);
    }
}