public class numericpattern259 {

    public static void main(String []args) {
        int n = 5;
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j < 2*n; j++) {
                if(j == n - i + 1 || j == n + i - 1) {
                    System.out.print(i);
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}