import java.util.Scanner;

class NumericPattern257{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int k = 0, m = height;
        
        for(int i = 1; i <= height; i++) {
            for(int j = i; j < height; j++) {
                System.out.print("  ");
            }
            while(k != 2*i-1) {
                if(k == 0 || k == 2*i-2) {
                    System.out.print(m + " ");
                }
                else {
                    System.out.print("  ");
                }
                k++;
            }
            m--;
            k = 0;
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//            5
//          4   4
//       3        3
//    2              2
// 1                    1

