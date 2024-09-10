public class peakelement {
    public static int findpeakelement(int [] nums){
        int n=nums.length;

        if(n==1){
            return 0;
        }

        if(nums[0]>nums[1]){
            return 0;
        }

        if(nums[n-1]>nums[n-2]){
            return n-1;
        }

        for(int i=0;i<n;i++){
            if(nums[i]>nums[i-1]&&nums[i]>nums[i+1]){
                return i;
            }
        }

        return -1;
    }
}
