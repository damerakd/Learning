package LeetCode;

//leetcode 35 Problem Search Insert Position

//Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.


public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        return searchInsertHelper(nums, 0, nums.length - 1, target);
    }

    public int searchInsertHelper(int[] nums, int left, int right, int target) {

        int mid = left + (right - left) / 2;

        if (right >= left) {

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                return searchInsertHelper(nums, left, mid - 1, target);
            }

            return searchInsertHelper(nums, mid + 1, right, target);
        }
        return mid;

    }
}
