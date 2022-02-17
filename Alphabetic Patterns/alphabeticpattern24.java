public class AlphabeticPattern {

    public static void main(String []args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");;
            }
            
            for(int k = i; k >= 0; k--) {
                System.out.print((char)(k + 65) + " ");
            }
                
            System.out.println();
        }
    }
}