// program to print following pattern
// 11111
// 22222
// 33333
// 44444
// 55555

package NumericPattern;

class numericpattern1 {

    public static void main(String[] args) {

        int rows = 5;
        numeric_rectangle(rows);
    }
    static void numeric_rectangle(int n){

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
