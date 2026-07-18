public class Stocks {

    public static void main(String[] args) {
        int[] stock = {7, 6, 4, 3, 1};


        int bestBuy = stock[0];
        int maxProfit = 0;

        for (int i = 1; i < stock.length; i++) {
            int currMax = stock[i] - bestBuy;
            bestBuy = Math.min(bestBuy, stock[i]);
            maxProfit = Math.max(maxProfit, currMax);
        }

        System.out.println(maxProfit);
    }
}
