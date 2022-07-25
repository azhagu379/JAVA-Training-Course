package TechnicalQuestion;

public class PatternProtech {
    public static void main(String[] args) {
        
        for(int i=1,k=5;i<5;i++)
        {
            for(int j=1;j<=i;j++)
                {
                   if(i%2==0)
                        System.out.print(j);
                    else 
                        System.out.print("*");
                   }
        
                
                System.out.println();
        }
        for(int i=5;i>0;i--)
        {
            for(int j=1;j<i-1;j++)
                {
                   if(i%2==0)
                        System.out.print(4-j);
                    else 
                        System.out.print("*");
                   }
        
                
                System.out.println();
        }
    }
    
}
