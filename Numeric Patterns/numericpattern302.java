public class numericpattern301 {

    public static void main(String []args) {
        int n = 5, x = 1;
        for(int i = 1; i <= n; i++) {
            for(int s = 1; s <= n - i; s++) {
                System.out.print("* ");
            }
            
            for(int j = 1; j < 2*i; j++) {
                if(j <= i) {
                    System.out.print(x - i + j + " ");
                }
                else {
                    System.out.print(x + i - j + " ");
                }
            }
            for(int s = 1; s <= n - i; s++) {
                System.out.print("* ");
            }
            
            x += 2;
            System.out.println();
        }
    }
    
}