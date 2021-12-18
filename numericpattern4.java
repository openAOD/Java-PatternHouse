package NumericPattern;

public class numericpattern4 {

    public static void main(String[] args) {

        int rows = 5;
        numeric_rectangle(rows);
    }
    static void numeric_rectangle(int n){

        for (int i = n; i >= 1; i--){
            for (int j = n; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
