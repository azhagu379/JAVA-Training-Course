package TechnicalQuestion;

import java.util.Arrays;

public class ArrayAscendingOrder {
    public static void main(String[] args) {
        
        int[] arr={8,2,9,7,33,3,87};
        //for(int element:arr)
            //System.out.println(element);
            //single line
        System.out.println(Arrays.toString(arr));

        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                //Ascending order
                if(arr[i]>arr[j]) //descending order < use it.
                {
                    temp=arr[i];    //8
                    arr[i]=arr[j];   //8=2
                    arr[j]=temp;    //2=8

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
