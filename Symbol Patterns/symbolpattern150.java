class symbolpattern {

    public static void main(String []args) {
        int n = 7, x = n/2;
    
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(j <= x || j >= n/2 + x) {
                    System.out.print("# ");
                }
                else {
                    System.out.print(". ");
                }
            }
            if(i <= n/2)
                x--;
            else
                x++;
                
            System.out.println();
        }    
    }
}