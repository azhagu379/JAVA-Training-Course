import java.util.Scanner;

public class GroupSwitch {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Find vowels or constant:");
        System.out.println("Enter the character:");
        char c=in.next().charAt(0);
        
        switch(c)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(c+"\tis vowels. ");
                break;
            default:
                System.out.println(c+"\tis consonant. ");
                break;

        }


    }
    
}
