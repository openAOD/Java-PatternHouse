class symbolpattern {

    public static void main(String []args) {
        int n = 3;
        for(int i = 1; i < n; i++) {
            for(int j = 1; j <= n; j++) {
                for(int k = 1; k <= j; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }    
    }
}