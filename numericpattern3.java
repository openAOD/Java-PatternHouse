package NumericPattern;

public class numericpattern3 {

    public static void main(String[] args) {

        int rows = 5;
        numeric_rectangle(rows);
    }

    static void numeric_rectangle(int n){

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
