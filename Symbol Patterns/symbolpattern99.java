public class symbolpattern {

    public static void main(String []args) {
        int n = 5, x = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= x; j++) {
                if(i != n/2 + 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(j + " ");   
                }
            }
            if(i <= n/2)
                x++;
            else
                x--;
            System.out.println();
        }    
    }
}