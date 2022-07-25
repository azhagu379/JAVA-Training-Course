public class ASCII {
    public static void main(String[] args) {
        
        /*
         Ascii - American code for information interchange
         
         Computer can only understand numbers,
         so an Ascii code is the numerical representation of a cahracter such as 'a' or'@ and etc
         The first 32 characters in the ASCII-table 
         are non printable control codes and are used to control peripherals such as printers.
         code 32-127 are common for all the different variations of the ASCII table, they are
         called printable characters, represent letters, digits, punctuation marks,
         and a few miscellaneous symbols.
         64-90=A-Z
         97-122=a-z
         48-57=0-9
         space=32

         */
        for(int i=0;i<=255;i++)
        {
            System.out.println(i+" "+(char)i);
        }

    }
    
}
