// 1. sort the array 
// 2. initialize the values take the first element as low and the last element as high
// 3. find out the mid value mid=low+high/2
// 4. check out the base cases if the number exists at the mid position else
// 5. if the number is lesser than the mid value replace the mid value to high and let the low be where it is
// 6. else if the number is greater than the mid value replace the low to mid and let high be where it is 

import java.util.Arrays;

class Solution {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        int low=0;
        int high=nums.length-1;
        

        // base case
        

     while(low<=high){
        int mid=low+high/2;

        if(target==nums[mid]){
            return mid;
        }else if(target<nums[mid]){
            high=mid-1;
         }else {
            low=mid+1;
         }

    } 
    return -1;

}
}

