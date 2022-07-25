package TechnicalQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class DataString {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String d="29/2/2000";
        String d1=d+"/";
        String[] str=new String[3];
        ArrayList<String> n=new ArrayList<>();
        String temp="";
        //String[] arr1 = d1.split("/");

        for(int i=0,j=0;i<d.length();i++)
        {
            if(d.charAt(i)!='/' || d.charAt(i) !='\0') 
           {
                temp=temp+d1.charAt(i);
                continue;
            }
           n.add(temp);
           
            
            temp="";

        }
        /*int dd=Integer.parseInt(str[0]);
        int mm=Integer.parseInt(str[1]);
        int yyy=Integer.parseInt(str[2]);
        System.out.println(dd);
        System.out.println(mm);
        System.out.println(yyy);
        //31-1,3,5,7,8,10,12
        //30 -2,4,6,,9,11
        //2-28


        if((mm==1 || mm==3  || mm==5 || mm==7 || mm==8 || mm==10 || mm==12)&&(dd<=31))
        {
            System.out.println("valid");
        }
        else if((mm==4 || mm==6  || mm==9 || mm==11)&&(dd<=30))
        {
            System.out.println("valid");
        }
        else if(mm==2)
        {
            if((((yyy%4==0)&&(yyy%100!=0))||(yyy%400==0))&&dd>=29)
            {
                System.out.println("thisvalid");
            }
            else if(dd<=28)
                System.out.println("valid");
            else 
                System.out.println("invalid");
        }
        else 
            System.out.println("invalid");*/


        System.out.println(Arrays.toString(str));

        
        
    }
    
}
