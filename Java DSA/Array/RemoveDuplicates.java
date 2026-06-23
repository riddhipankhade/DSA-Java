package Array;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums){
        int slow = 0;
        int fast = 1;

        for(int i = fast; i< nums.length;i++){
            if(nums[i] != nums[slow]){
                slow++;
                nums[slow] = nums[i];
            }
        }
        int  k = slow + 1;
        return k; 

    }
}
