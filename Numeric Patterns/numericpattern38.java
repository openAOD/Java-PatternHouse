import java.util.Scanner;

class NumericPattern38 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 1; i <= height; i++) {
            int l = 0;
            int m = height - 1;
            for (int j = 1; j < i; j++) {
                l = l+m;
                m--;
            }
            int p = m + 1;
            for(int j = 1;j <= i; j++) {
                int k = i + l;
                if(k <= 9)
                    System.out.print(" " + k + " ");
                else
                    System.out.print(k + " ");
                l = l - p;
                p++;
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//  1
//  6  2
// 10  7  3
// 13 11  8  4
// 15 14 12  9  5
