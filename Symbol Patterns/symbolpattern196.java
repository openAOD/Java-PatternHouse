class symbolpattern {

    public static void main(String []args) {
        int n = 5, mid = n/2 + 1;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= mid; j++) {
                if(j == 1 || i == 1 || i == mid || (j == mid && i < mid)) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}