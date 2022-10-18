class symbolpattern {

    public static void main(String []args) {
        int n = 5;
        
        for(int i = n/2; i <= n; i+= 2) {
            for(int j = 1; j < n - i; j += 2)
                System.out.print(" ");
            
            for(int k = 1; k <= i; k++)
                System.out.print("*");
                
            for(int j = 1; j <= n - i; j++)
                System.out.print(" ");
                
            for(int k = 1; k <= i; k++)
                System.out.print("*");
                
            System.out.println();
        }
        
        for(int i = n; i >= 1; i--) {
            for(int j = i; j < n; j++)
                System.out.print(" ");
                
            for(int k = 1; k <= (i*2) - 1; k++)
                System.out.print("*");
                
            System.out.println();
        }
    }
}