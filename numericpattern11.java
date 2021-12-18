package NumericPattern;

public class numericpattern11 {

    public static void main(String[] args) {

        int rows = 5;
        numeric_rectangle(rows);
    }
    static void numeric_rectangle(int n){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                {
                    if (j % 2 == 0)
                        System.out.print((n * (j)) + i + 1 + " ");
                    else
                        System.out.print((n * (j)) + i + 1 + " ");
                }
            }
            System.out.println();
        }
    }
}
