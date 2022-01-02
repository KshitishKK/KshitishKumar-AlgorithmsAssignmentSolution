package Stockers;
import java.util.*;
public class SearchStock extends Driver {
    public void stocksearch(float []arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key value : ");
        float k=sc.nextFloat();
        for(float e:arr)
        {
            if(e==k)
            {
                System.out.println("Stock of value " + k + " is present");
            }
        }
        System.out.println("-----------------------------------------------\n");
    }
}
