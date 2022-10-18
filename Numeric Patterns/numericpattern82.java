class numericpattern82 {

    public static void main(String []args) {
        int n = 5, num = n*(n+1)/2;
        for(int i = 1; i <= n; i++) {
            for(int j = n; j >= 1; j--) {
                if(i >= j) {
                    System.out.printf("%2d ", num--);
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    
}