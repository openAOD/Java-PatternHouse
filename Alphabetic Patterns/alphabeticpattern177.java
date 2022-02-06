public class alphabeticpattern {

    public static void main(String []args) {
        int n = 5;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n/2 + 1; j++) {
                if(j == 1 || i == n) {
                    System.out.print("L ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}