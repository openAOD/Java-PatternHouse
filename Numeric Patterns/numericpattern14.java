public class numericpattern14 {

    public static void main(String []args) {
        int n = 5, x, y;
        for(int i = 1; i <= n; i++) {
            x = i;
            y = n - i + 1;
            for(int j = 1; j <= n; j++) {
                if(j % 2 == 0) {
                    System.out.printf("%2d ", x);
                }
                else {
                    System.out.printf("%2d ", y);
                }
                
                x += n;
                y += n;
            }
            System.out.println();
        }
    }
    
}