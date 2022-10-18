class numericpattern81 {

    public static void main(String []args) {
        int n = 5, num = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = n; j >= 1; j--) {
                if(i >= j) {
                    System.out.printf("%2d ", num++);
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    
}