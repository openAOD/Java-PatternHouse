public class AlphabeticPattern {

    public static void main(String []args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");;
            }
            
            for(int k = n - i; k >= 0; k--) {
                System.out.print((char)(k + 65) + " ");
            }
                
            System.out.println();
        }
    }
}