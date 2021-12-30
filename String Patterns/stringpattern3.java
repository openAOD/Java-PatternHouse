import java.util.Scanner;
public class StringPattern3
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int l = str.length();
        for(int i=0;i<l;i++) {
            for(int j=0;j<=i;j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}
