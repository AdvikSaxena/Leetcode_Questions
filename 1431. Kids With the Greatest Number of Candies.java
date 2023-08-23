class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         int max =0;
         for(int a:candies)
         {
             if(a>max)
             {
                 max=a;
             }
         }
         int temp=max-extraCandies;
          ArrayList<Boolean> arr = new ArrayList<Boolean>();
         for(int i=0;i<candies.length;i++)
         {
             if(candies[i]>=temp)
             {
                 arr.add(true);
             }
             else{
                 arr.add(false);
             }
         }
         return arr;
    }
}
