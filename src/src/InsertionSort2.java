package src;
/**
 * program: insertionSort2
 * purpose: sorts an ArrayList of doubles into ascending order using
 * a InsertionSort Sort. In order to place doubles in an ArrayList,
 * they must be encapsulated in the Double class.
 * 
 */

import java.util.*;

public class InsertionSort2
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        ArrayList<Double> a = new ArrayList<Double>();         // the array
        int i=1;            
        double x;
        
        do 
        {
            System.out.print("Please enter item #" + i + " ( Negative to quit): ");
            x = console.nextDouble();
            if( x >= 0)
            {
                a.add( new Double(x) );
                i++;
            }
        } while( x >= 0 );
    
        System.out.println( "Initial List" );    
        putList( a );
      
        inSort( a );                      // Sort list
    
        System.out.println( "Final List");    // Display Sorted List
        putList( a );

    }
    // function: inSort
    // purpose:  Sorts an array into ascending order
    // input:    the list x, and the number of elements
    // output:   updated list with elements sorted
    
    public static void inSort( ArrayList<Double> x)
    {
      double value;
      for(int n =1; n< x.size(); n++)
      {
          value = x.get(n);
          int i = n-1;
          while( i >=0 && x.get(i) > value)
          {
              x.set(i+1,(x.get(i)));
              i--;
              x.set(i+1,value);
            }
        }
    }
   
    // function: putList
    // purpose:  Display an array of n items as a single line
    // input:    the list x, and size n
    // output:   the list is printed on the display
    public static void putList( ArrayList<Double> x)
    {
        for( int i=0; i < x.size(); i++)
           System.out.printf("%.2f ", (x.get(i)).doubleValue() );
        System.out.println();
    }
}
