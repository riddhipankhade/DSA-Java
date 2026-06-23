public class FloorAndCeil {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int floor = getFloor(nums, x);
        int ceil = getCeil(nums, x);

        int[] floorAndCeil = new int[2];
        floorAndCeil[0] = floor;
        floorAndCeil[1] = ceil;
        return floorAndCeil;
    }

    public int getFloor(int[] nums, int x){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid]<=x){
                ans = nums[mid];
                start = mid + 1;
            }else{
                end = mid - 1;
            }
       }
       return ans;
    }
    public int getCeil(int[] nums, int x){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid]>=x){
                ans = nums[mid];
                end = mid - 1;
            }else{
                start = mid + 1;
            }
       }
       return ans;
    }
}
