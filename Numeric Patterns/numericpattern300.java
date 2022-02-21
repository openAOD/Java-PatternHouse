public class numericpattern300 {

    public static void main(String []args) {
        int n = 5, x = n + 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= x; j++) {
                if(j <= x/2) {
                    System.out.print(j + " ");
                }
                else {
                    System.out.print(x - j + 1 + " ");
                }
            }
            
            if(i <= n/2) {
                x -= 2;
            }
            else {
                x += 2;
            }
            System.out.println();
        }
    }
    
}