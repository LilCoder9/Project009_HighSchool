package src;
/** InsertionSort1
 *    sorts a "built-in"  array of doubles into ascending order using an insertion sort
 */

import java.util.*;

public class InsertionSort1
{
    final static int MAX_LENGTH = 50;
    
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        double  a[] = new double[ MAX_LENGTH ];      // the array
        int          size= 0;  // number of elements in a being used.
        double  x;
        
        do 
        {
            System.out.print("Please enter item #" + size + " ( Negative to quit): ");
            x = console.nextDouble();
            if( x >= 0)
            {
                a[size] = x;
                size++;
            }
        } while( x >= 0 );
    
        System.out.println( "Initial List" );    
        putList( a, size );
      
        inSort( a, size );                      // Sort list
    
        System.out.println( "Final List");    // Display Sorted List
        putList( a,size );

    }
    
    /**
     * InSort - Sorts an array of doubles into ascending order
     * @param x  the list of doubles
     * @return a array sorted in increasing order.
     */
    public static void inSort( double [] x, int size)
    {
      double value;
        for(int n=1;n< size;n++)
      {
         value = x[n];
         int i =n-1; // look at binsearch createInOrder method!!!!!!!!!!!!!!!!
      while( i >= 0 && x[i] > value)
       {
           x[i + 1] = x[i];
           i--;
           x[i+1] =value;
        }
      

        
    }
}

    /**
     *  putList -  Display an double array of "size" items as a single line
     *  @param x an array of doubles
     *  @param size the number of occupied locations in array x
     */
    public static void putList( double[] x, int size )
    {
        for( int i=0; i < size; i++)
           System.out.printf( "%.2f ", x[i]);
        System.out.println();
    }
}
