package TechnicalQuestion.Stringjava;

public class EachWordCapitalezed {
    public static void main(String[] args) {
        
        StringBuffer a=new StringBuffer("aLagu mani kandan");
        System.out.println(a);
        if(a.charAt(0)>='a' && a.charAt(0)<='z')
            {
                int temp=(int)a.charAt(0)-32;
                a.setCharAt(0, (char)temp);
            }
        for(int i=1;i<a.length();i++)
        {
            if(a.charAt(i)==' ')
            {i++;
                if(a.charAt(i)>='a' && a.charAt(i)<='z')
                {
                    int temp=(int)a.charAt(i)-32;
                    a.setCharAt(i, (char)temp);
                }
                
                }else{ if(a.charAt(i)>='A' && a.charAt(i)<='Z')
                {
                    int temp=(int)a.charAt(i)+32;
                    a.setCharAt(i, (char)temp);
    
                }
                    
            }
        }
        System.out.println(a);

        
    }
    
}
