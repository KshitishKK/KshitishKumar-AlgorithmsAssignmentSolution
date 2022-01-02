package Stockers;
import java.util.*;
public class Driver {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        // taking the number of companies and stock price as input
        System.out.println("Enter the number of Companies : ");
        int n = sc.nextInt();
        boolean pricearray[]= new boolean[n];
        float arr[]= new float[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter current stock price of the company "+ (i+1));
            arr[i]= sc.nextFloat();
            System.out.println("Whether company's stock price rose today compare to yesterday?");
            pricearray[i]= sc.nextBoolean();
        }

        // Asking the user to select the operation to perform
        boolean condition =true;
        while(condition)
        {
            System.out.println("Enter the operation that you want to perform\n" +
                    "1. Display the companies stock prices in ascending order\n" +
                    "2. Display the companies stock prices in descending order\n" +
                    "3. Display the total no of companies for which stock prices rose today\n" +
                    "4. Display the total no of companies for which stock prices declined today\n" +
                    "5. Search a specific stock price\n" +
                    "6. press 0 to exit\n" );
            System.out.println("-----------------------------------------------");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1 : Ascending asc= new Ascending();
                asc.sortinascending(arr);
                break;

                case 2 :  Descending dsc= new Descending();
                dsc.sortindescending(arr);
                break;

                case 3 : PriceRise pr= new PriceRise();
                pr.pricerisetoday(pricearray);
                    break;

                case 4 : PriceDecline pd= new PriceDecline();
                pd.pricedeclinetoday(pricearray);
                break;

                case 5 : SearchStock ss= new SearchStock();
                ss.stocksearch(arr);
                break;

                case 0 :
                    System.out.println("Exited successfully");
                    condition=false;

                default:
                    System.out.println("");
            }
        }
      }
}
