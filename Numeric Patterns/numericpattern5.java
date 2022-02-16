public class numericpattern5 {

    public static void main(String[] args) {
        int n = 5, num = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++) {
                System.out.printf("%2d ", num++);
            }
            System.out.println();
        }
    }
}