package chegg;

import java.util.ArrayList;

public class Sorting<T>
{
    //-----------------------------------------------------------------
    //  Sorts the specified array of objects using the selection
    //  sort algorithm.
    //-----------------------------------------------------------------
    public <T extends Comparable<T>> void selectionSort(T[] list)              // Modification done here 
    {
        int max;
        Comparable<T> temp;

        for (int index = 0; index < list.length-1; index++)
        {
            max = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo((T)list[max]) > 0)
                    max = scan;

            // Swap the values
            temp = list[max];
            list[max] = list[index];
            list[index] = (T) temp;                                    // casted with T
        }
    }

    //-----------------------------------------------------------------
    //  Sorts the specified array of objects using the insertion
    //  sort algorithm.
    //-----------------------------------------------------------------
    public <T extends Comparable <T>> void insertionSort (T[] list)             // Modification done here 
    {
        for (int index = 1; index < list.length; index++)
        {
            Comparable<T> key = list[index];
            int position = index;

            //  Shift larger values to the right
            while (position > 0 && key.compareTo((T)list[position-1]) > 0)
            {
                list[position] = list[position-1];
                position--;
            }

            list[position] = (T) key;                    // casted with T
        }
    }
    
}
