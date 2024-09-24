public class BestTimeToBuyAndSellStock {
        public int maxProfit(int[] prices) {
            // int min = 10000;
            // for( int i=0; i<prices.length; i++){
            //     min = Math.min(min,prices[i]);
            // }
            int left = 0;
            int right = 1;
            int max = 0;
            while(right<prices.length){
                if(prices[right]<prices[left]){
                    left=right;
                    right++;
                }
                else{
                    max = Math.max(max, prices[right]-prices[left]);
                    right++;
                }

            }
            return max;

        }
    }