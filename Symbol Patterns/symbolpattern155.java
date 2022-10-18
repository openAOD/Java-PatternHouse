class symbolpattern {

    public static void main(String []args) {
        int n = 6;
        
        for(int i = 1; i <= n; i++) {
            int k = (i % 2 != 0) ? i + 1 : i;
            
            for(int s = n; s > k; s--) {
                System.out.print("  ");
            }
            
            for(int j = 0; j < k; j++)  {
                System.out.print("* ");
            }
            
            System.out.println();
        }    
    }
}