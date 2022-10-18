class symbolpattern {

    public static void main(String []args) {
        int n = 4;
        int size = n*(n+1), x = 1, y;
        
        for(int i = 1; i <= n; i++) {
            y = size - n + i;
            for(int j = 1; j <= 2*n; j++) {
                if(j > 2 * (i - 1)) {
                    if(j <= (2*n)/ 2 + i - 1) {
                        System.out.printf("%3d", x++);
                    }
                    else {
                        System.out.printf("%3d", y++);   
                    }
                }
                else {
                    System.out.print("  _");
                }
            }
            size -= (n - i + 1);
            System.out.println();
        }    
    }
}