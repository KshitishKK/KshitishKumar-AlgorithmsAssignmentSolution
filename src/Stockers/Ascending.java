package Stockers;
import java.util.*;
public class Ascending extends Driver {
    public void sortinascending(float[] arr)
    {
        System.out.println("Stock prices in ascending order are :");
        Arrays.sort(arr);
        for(float e:arr) {
            System.out.print(e + " ");
        }
        System.out.println("\n-----------------------------------------------\n");
        }
}
