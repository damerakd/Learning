package Arrays;

public class ArrayReverse {

    public int[] arrayReverseIterative(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        int temp;

        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }

    public int[] arrayReverseRecursive(int[] nums) {

        return arrayReverseRecursiveHelper(nums, 0, nums.length - 1);
    }

    public int[] arrayReverseRecursiveHelper(int[] nums, int start, int end) {

        int temp;
        if (start > end)
            return nums;
        temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        return arrayReverseRecursiveHelper(nums, start + 1, end - 1);
    }
}
