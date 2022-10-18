class symbolpattern {

    public static void main(String []args) {
        int n = 10;
        int x = n/2, y = n/2;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < n; j++) {
                if((i == 1 || i == n) && j == n/2) {
                    System.out.print("*");
                }
                else if(j == x)
                    System.out.print("/");
                else if(j == y)
                    System.out.print("\\");
                else {
                    System.out.print(" ");
                }
            }
            if(i == n/2) {
                int t = x;
                x = y;
                y = t;
            }
            else {
                x--;
                y++;
            }
            System.out.println();
        }    
    }
}