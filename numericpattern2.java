// program to print following pattern
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5

package NumericPattern;

public class numericpattern2 {

    public static void main(String[] args) {

        int rows = 5;
        numeric_rectangle(rows);
    }
    static void numeric_rectangle(int n){

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
