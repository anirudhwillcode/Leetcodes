import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
    public List<Integer>findelerep(int[] nums){
        List<Integer>result=new ArrayList<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>n/3 && !result.contains(nums[i])){
                result.add(nums[i]);
            }
        }
        return result;
    }
}
