[15:55, 31/12/2021] Mahak Garg: import java.util.Scanner ;
public class StringPattern8
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int l = str.length();
        int n = s.nextInt();
        int index = l - n - 1;
        
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(str.charAt(index--));
                if(index == -1) {
                    index = l-1;
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- PatternHouse
                   4
// Output :-
// Hnre
// ttaP
// esuo
