public class firstAndLastPositionOfElement {
    public int[] searchRange(int[] nums, int target) {
        int first = lowerBound(nums, target);
        int last = upperBound(nums, target);

         if(first == -1 || nums[first] != target)
            return new int[]{-1, -1};

        return new int[]{first, last};
    }
    public int lowerBound(int[] nums,  int target){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] >= target){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
    public int upperBound(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] <= target){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
    
}
