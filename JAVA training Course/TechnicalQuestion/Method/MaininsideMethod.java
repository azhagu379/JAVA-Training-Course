package TechnicalQuestion.Method;

import java.util.Arrays;
import java.util.Scanner;

public class MaininsideMethod {

    public static int[] sendArray()
    {

        return new int[]{2,3,4};
    }
    public static int[] sortArray()
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the limit of Array:");
        int a=in.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the elemet:"+(i+1));
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args) {
        
        int arr[]=sendArray();
        int arr1[]=sortArray();

        for(int e:arr1)
            System.out.println(e);

        
    }
    
}
