package src;

// program: BinSearch1.java
//
import java.util.*;

public class BinSearch1
{
    public static void main(String[] args)
    {
        final int size = 50;
        Scanner console = new Scanner(System.in);
        
        // declaring arrays
        int[]  item = new int[size];    // The list of numbers
        int    items=0;     // number of values in list
        int location;
        int seekValue;

        // method returns number of items entered by user.
        // user enters -1 to end entry process.
        //
        items = createInOrder( item );
         
        System.out.println("Element\t\tValue");

        // Display the current list
        //
        for( int i=0; i < items; i++ )
            System.out.println( i + "\t\t" + item[i] );
         
        System.out.print("Enter a value to seek: ");
        seekValue = console.nextInt();
        
        location = binSearch( item, items, seekValue);
         
        if( location >= 0 )
          System.out.println("Element found at location " + location);
        else
          System.out.println("Element not found in list");
    }

    
    
   
    public static int binSearch( int[] n, int items,  int seekValue )
    {           
       int m;
       int h;
       int l=0;
       
       h= items-1;
     
   while(l < h)
    {
      m = (h+l ) / 2;
      if(n[m] > seekValue)  
         {
             h = m-1;

            }
      if(n[m] < seekValue)
      {
        l = m+1;
    } 
       if(n[m] == seekValue)
       {
           return m;
      }
    }
    return -1;
}

    
   

    //
    public static int createInOrder( int[] n )
    {
        int    i;
        int    value=0;
        int    items=0;
        Scanner console = new Scanner(System.in);
        
        while( items < n.length && value >= 0 ) 
        {
            System.out.print("Enter a positive number to insert (negative to quit): ");
            value = console.nextInt();
            
            if( value >= 0 )
            {
                // insert into array
                
                // step 1- locate the proper space for the item.
                i=0;
                while( i < items && n[i] < value)
                    i++;
                    
                // step 2- shift others down
                for( int j=items-1; j >=i; j--)
                    n[j+1] = n[j];
                
                // step 3- insert new item
                n[i] = value;
                items++;
                
            }
        }
        // return number of values entered
        return items;   
    }

}
