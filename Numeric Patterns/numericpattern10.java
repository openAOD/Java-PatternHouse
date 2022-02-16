public class numericpattern10 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n/2 + 1; j++) {
                System.out.print(i + " " + j + " ");
            }
            System.out.println();
        }
    }
    
}