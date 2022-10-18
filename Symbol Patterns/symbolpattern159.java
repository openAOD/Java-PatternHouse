class symbolpattern {

    public static void main(String []args) {
        int n = 3;
    
        for(int i = 1; i <= n; i++) {
            for(int j = n - 1; j > 0; j--) {
                for(int s = n - 1; s >= i; s--) {
                    System.out.print("  ");
                }
                
                for(int k = 0; k < i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }    
    }
}