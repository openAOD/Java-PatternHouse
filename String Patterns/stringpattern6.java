import java.util.Scanner;
public class StringPattern6
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int l = str.length();
        for(int i=0;i<l;i++) {    //loop to print row
            for(int j=0;j<i;j++){    //loop to print spaces
                System.out.print(" ");
            }
            for(int k=0;k<l-i;k++) {    //loop to print value
                System.out.print(str.charAt(k));
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
