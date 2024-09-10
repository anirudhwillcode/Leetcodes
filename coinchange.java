public class coinchange {
    public static void main(String [] args){

    }
    public static int coinChange(int[] coins,int amount){
        if(amount<1) return 0;

        int[] minCoinsDP=new int[amount+1];

        for(int i=1;i<=amount;i++){
            minCoinsDP[i]=Integer.MAX_VALUE;

            for(int coin:coins){
                if(coin <=i && minCoinDP)
            }
        }
    }
}
