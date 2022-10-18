class symbolpattern77 {

    public static void main(String []args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == n/2 + 1 || j == n/2 + 1) {
                    System.out.print("X ");
                }
                else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }    
    }
}