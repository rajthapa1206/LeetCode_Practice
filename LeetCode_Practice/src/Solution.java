public class Solution { 
	public static void main (String[] args) {
		int[] nums = {2,3,8,10};
		int target = 12;
		System.out.println(twoSum(nums, target));
	}
    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    output[0] = i;
                    output[1] = j;
                }
            }
        }
        return output;
    }
}