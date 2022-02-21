public class numericpattern92 {

    public static void main(String []args) {
        int n = 5, num = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.printf("   ");
            }
            for(int k = n - 1; k >= i; k--) {
                System.out.printf("%2d ", num - i);
                num++;
            }
            System.out.println();
        }
    }
    
}