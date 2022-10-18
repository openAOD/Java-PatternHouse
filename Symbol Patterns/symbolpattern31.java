class symbolpattern31 {

    public static void main(String []args){
        int n = 5, x = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if((i % 2 == 1 && j <= x) || (i % 2 == 0 && j >= n - x + 1)) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("# ");
                }
            }
            System.out.println();
            
            if(i == n/2 + 1) {
                x = 1;
            }
            else {
                x++;
            }
        }    
    }
}