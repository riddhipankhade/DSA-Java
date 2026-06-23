public class searchInRotatedArray {

    public static int search(int[] nums, int target){

        // two pointers for binary search
        int left = 0, right = nums.length - 1;

        // classic binary search loop
        while(left <= right){

            // avoid overflow compared to (left + right)/2
            int mid = left + (right - left) / 2;

            // found target directly
            if(nums[mid] == target){
                return mid;
            }

            // check which half is sorted
            // if left value <= mid value → left half is sorted
            if(nums[left] <= nums[mid]){

                // now check if target lies inside this sorted left half
                // range: [left, mid)
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;   // search left half
                }else{
                    left = mid + 1;    // search right half
                }

            }else{
                // otherwise right half must be sorted

                // check if target lies inside sorted right half
                // range: (mid, right]
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;    // search right half
                }else{
                    right = mid - 1;   // search left half
                }
            }
        }

        // target not found
        return -1;
    }
}
