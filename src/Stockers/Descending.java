package Stockers;
import java.util.*;
public class Descending extends Driver{
    public void sortindescending(float []arr)
    {
        int n = arr.length;
        {
            int i, k;
            float t;
            for (i = 0; i < n / 2; i++) {
                t = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = t;
            }

            // printing the reversed array
            for (k = 0; k < n; k++) {
               // System.out.println(arr[k]);
            }
        }
        System.out.println("Stock prices in descending order are :");
        for(float e:arr)
        {
            System.out.print(e +" ");
        }
        System.out.println("\n-----------------------------------------------\n");
    }
}
