class Solution {
    public int[] getConcatenation(int[] nums) {
        int l=nums.length*2;
        int[] arr=new int[l];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        for(int i=0,j=nums.length;i<nums.length;i++,j++)
        {
            arr[j]=nums[i];
        }
        return arr;
    }
}
