class symbolpattern {

    public static void main(String []args) {
        int n = 3, c1 = n*2 - 1, c2 = 3;
    
        for(int i = 1; i <= n; i++) {
            for(int j = n - 2; j < i; j++)
                System.out.print("    ");
                
            for(int k = 1; k <= c1; k++)
                System.out.print("* ");
                
            c1 -= 2;
            System.out.println();
        }
        
        for(int i = 1; i < n; i++) {
            for(int j = n - 2; j >= i; j--)
                System.out.print("    ");
                
            for(int k = 1; k <= c2; k++)
                System.out.print("* ");
                
            c2 += 2;
            System.out.println();
        }
    }
}