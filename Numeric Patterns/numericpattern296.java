public class numericpattern296 {

    public static void main(String []args) {
        int n = 7, x = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n/2 + 1; j++) {
                if(j >= x) {
                    System.out.print(j + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            if(i <= n /2) {
                x++;
            }
            else {
                x--;
            }
            System.out.println();
        }
    }
    
}