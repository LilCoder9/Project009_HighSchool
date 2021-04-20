package src;

/**
 * Introduction to "built-in Arrays" - Part 1
 * 
 * Topics: What is an array and organization.
 *    
 */
import java.util.*;

public class LinearSearch1
{
    public static void main(String[] args)
    {
       double[] b;
       
       b = new double[4];
       
       b[0] = 2.0; b[1] = 4.0;
       b[3] = 2.1; b[2] = 3.0; //b[4] = 7.0; will give array out of bounds
       
       
       int i;
       for( i =0; i < b.length; i++)
       {
           System.out.printf(" %d %f\n", i, b[i]);
        }
        
        doubleArray(b);
         printArray(b);
    }
    
    public static void printArray( double [] w )
    {
        int i;
        
        for( i =0; i < w.length; i++)
       {
           System.out.printf(" %d %f\n", i, w[i]);
        }
    }
    
    public static void doubleArray( double [] p)
    {
        int i;
        
        for( i=0; i < p.length; i++)
        {
            p[i] = p[i] * 2;
        }
    }
}
