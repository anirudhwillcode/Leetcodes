package AccentureProblems;
public class leaders {
    public static int findLeaders(int [] arr){
        int n=arr.length;
        int s=0;
        for(int i=0;i<n;i++){
            int j=0;
            for(j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    break;
                }
            }
            if(j==n){
                s=s+arr[i];
            }
        }

        return s;
    }
}
