/*
    source : leetcode.com
    task link: https://leetcode.com/problems/two-sum/
    problem [0001] : Two Sum
    time: O(n^2)
 */

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int [] pair = new int[2];
        for (int i = 0; i < nums.length - 1; i++)   {
            for (int j = i + 1; j < nums.length; j++)   {
                if (nums[i] + nums[j] == target) {
                    pair[0] = i;
                    pair[1] = j;
                    return pair;
                }
            }
        }
        return pair;
    }
}
