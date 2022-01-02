package Stockers;

public class PriceRise extends Driver {
    public void pricerisetoday(boolean []pricearray)
    {
        int count=0;
        for(int i=0;i<pricearray.length;i++)
        {
           if(pricearray[i]==true)
           {
              // System.out.println(pricearray[i]);
               count++;
           }
        }
        System.out.println("Total no of companies whose stock price rose today : " + count);
        System.out.println("-----------------------------------------------\n");
    }
}
