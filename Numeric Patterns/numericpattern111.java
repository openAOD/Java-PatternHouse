public class numericpattern111 {

    public static void main(String []args) {
        int n = 3, t = 1, x = 1, y;
        for(int i = 0; i < n; i++) {
            for(int j = n - 1; j > i; j--) {
                System.out.printf("  ");
            }
            for(int k = 0; k < t; k++) {
                if(i == k) {
                    y = 2*k*(x + 1);
                    y = (y == 0) ? 1 : y;
                    System.out.print(y + " ");
                    continue;
                }
                x += 2;
                System.out.print(x + " ");
            }
            
            t += 2;
            System.out.println();
        }
    }
    
}