package TechnicalQuestion;

import java.util.Arrays;

public class ArrayInsertSpecificIndex {
    public static void main(String[] args) {
        // program to insert a element in specific index of an array

        int[] arr={10,20,30,40,50,60,70,80,90,100};
        
        int index=2;
        int value=55;
        System.out.println(Arrays.toString(arr));

        for(int i=arr.length-1;i>index;i-- )
        {
            arr[i]=arr[i-1];

        }
        arr[index]=value;
        System.out.println(Arrays.toString(arr));

        
        
    }
    
}
