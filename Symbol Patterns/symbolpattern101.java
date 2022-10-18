class symbolpattern {

    public static void main(String []args) {
        int n = 7, x = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < 2*x; j++) {
                if(i <= n/2 + 1 && j % 2 == 1) {
                    System.out.print(i);
                }
                else if(i > n/2 + 1 && j % 2 == 1) {
                    System.out.print(n - i + 1);
                }
                else {
                    System.out.print(" * ");   
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