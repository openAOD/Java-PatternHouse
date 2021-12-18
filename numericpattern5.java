package NumericPattern;

public class numericpattern5 {

    public static void main(String[] args) {

        int rows = 5;
        numeric_rectangle(rows);
    }
    static void numeric_rectangle(int n){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                {
                    System.out.print((n * (i)) + j + 1 + " ");
                }
            }
            System.out.println();
        }
    }
}
