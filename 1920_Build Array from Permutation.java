class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr=new int[nums.length];
        int temp;
        for(int i=0;i<nums.length;i++)
        {
            temp=nums[i];
            arr[i]=nums[temp];
        }
        return arr;
    }
}
