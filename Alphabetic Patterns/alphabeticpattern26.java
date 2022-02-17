public class AlphabeticPattern {

    public static void main(String []args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print("  ");;
            }
            
            for(int k = i; k <= n; k++) {
                System.out.print((char)(i + 64) + " ");
            }
                
            System.out.println();
        }
    }
}