public class lowerbound {
       public int lowerBound(int[] nums, int x) {
       int start = 0;
       int end = nums.length - 1;
        int ans = nums.length;

       while(start <= end){
        int mid = start + (end - start)/2;
        if(nums[mid]>=x){
            end = mid - 1;
            ans = mid;
        }else if(nums[mid]<x){
            start = mid + 1;
        }
       }
       return ans;
     }
}
