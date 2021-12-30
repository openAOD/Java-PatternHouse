import java.io.*;
import java.util.Scanner;
public class StringPattern2
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      
        String str = s.nextLine();
        String rev = "";
        
        int l = str.length();
        
        char ch;
        
        for (int i=0; i<l; i++) {
            ch= str.charAt(i);
            rev= ch+rev;
        }
        
        for(int i=0;i<4;i++) {
            System.out.println(rev);
        }
    }
}
