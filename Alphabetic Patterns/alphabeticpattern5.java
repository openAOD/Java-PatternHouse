import java.util.Scanner;
public class AlphabeticPattern5
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of words to be printed in each line
        
        char ch = 'A';
        for(char i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :- 
// A B C D E
// F G H I J
// K L M N O 
// P Q R S T 
// U V W X Y
