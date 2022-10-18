import java.util.Scanner;
class AlphabeticPattern98
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of lines to be printed

        char ch = 'A';
      
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
              
                if (j==i || n-j+1 == i){
                    char c = (char)(j + 64);
                    System.out.print(c + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// A       E    
//   B   D
//     C
//   B   D
// A       E
