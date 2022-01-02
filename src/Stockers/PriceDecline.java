package Stockers;

public class PriceDecline extends Driver {
    public void pricedeclinetoday(boolean []pricearray) {
        int count = 0;
        for (int i = 0; i < pricearray.length; i++) {
            if (pricearray[i] == false) {
                // System.out.println(pricearray[i]);
                count++;
            }
        }
        System.out.println("Total no of companies whose stock price declined today : " + count);
        System.out.println("-----------------------------------------------\n");
    }
}
