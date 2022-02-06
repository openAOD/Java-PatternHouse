public class alphabeticpattern {

    public static void main(String []args) {
        int n = 5;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == 1 || i == n/2 + 1 || i == n || j == 1) {
                    System.out.print("E ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}