public class symbolpattern {

    public static void main(String []args) {
        int n = 3;
    
        for(int i = n; i >= 1; i--) {
            for(int j = n - 1; j > 0; j--) {
                for(int k = 0; k < i; k++)  {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }    
    }
}