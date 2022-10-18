class numericpattern162 {

    public static void main(String []args) {
        int n = 4;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < 2*n; j++) {
                if(i == j || j == n || j == 2*n - i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    
}