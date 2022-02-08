public class alphabeticpattern {

    public static void main(String []args) {
        int n = 5, mid = n/2 + 1;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == 1 || j == mid || i == n) {
                    System.out.print("I ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}