package src;
import java.util.*;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] x = {1, 3, -2, 10, 5, 4, 7, 9 };
        
        //sort the list
        selectionSort(x);
        
        //display the list
        printList(x);
    }
    
    // ADD SELECTION SORT METHOD HERE
    public static void selectionSort( int[] x )
    {
        int i, j, n, max, maxIndex;
        n=x.length-1;
        while(n> 0)
        {
            max=x[0];
            maxIndex=0;
            for(i=0; i <= n; i++)
            {
                if( x[i] > max)
                {
                    max = x[i];
                    maxIndex = i;
                    
                }
            }
             swap(x,maxIndex, n);
            n--;
        }
    }
    public static void swap( int []x, int i, int j)
    {
        int temp =x[i];
        x[i] = x[j];
        x[j] = temp;
    }
    // Method to print an array.
    public static void printList( int[] x)
    {
        //display the list
        for(int i = 0; i < x.length; i++)
            System.out.printf( "%3d ", x[i]);
        System.out.println();
    }
    
}