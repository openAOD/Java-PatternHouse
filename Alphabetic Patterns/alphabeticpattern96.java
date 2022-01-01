import java.util.Scanner;
public class AlphabeticPattern96
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of lines to be printed
        
        int x = 1, y = 1;
        char ch = 'A';
        
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=(n-i);j++) {
                System.out.print(" ");
            }
          
            for(int k=1;k<=y;k++) {
                if(i%2==0) {
                    System.out.print(ch++);
                }
                else {
                    System.out.print(x++);
                }
                if(x>9) {
                    x = 1;
                }
            }
          
            y = y + 2;  
            System.out.println();
        }
    }
  
  // Sample Input :- 5
  // Output :-
  //     1
  //    ABC
  //   23456
  //  DEFGHIJ
  // 789123456
  
