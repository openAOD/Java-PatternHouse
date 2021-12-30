import java.util.Scanner;
public class StringPattern1
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n = s.nextInt();
        
        for(int i=0;i<n;i++) {
            System.out.println(str);
        }
    }
}
