public class alphabeticpattern {

    public static void main(String []args) {
        int n = 5, x = n/2 + 1;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n/2 + 1; j++) {
                if(j == 1 || j == x) {
                    System.out.print("K ");
                }
                else {
                    System.out.print("  ");
                }
            }
            if(i <= n/2)
                x--;
            else
                x++;
                
            System.out.println();
        }
    }
}