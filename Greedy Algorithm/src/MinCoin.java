

public class MinCoin {

    public static int minCoin(int[] rupees, int amount){

        int coinCount = 0;

        for(int i = rupees.length - 1; i >= 0; i--){
            if(rupees[i] <= amount){
                while(amount >= rupees[i]){
                    amount = amount - rupees[i];
                    coinCount++;
                }
            }
        }

        return coinCount;
    }

    public static void main(String[] args) {
      int[] rupee = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

      int amount = 570;

        System.out.println(minCoin(rupee, amount));
    }
}
