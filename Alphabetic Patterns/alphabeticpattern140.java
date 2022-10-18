class alphabeticpattern140 {

    public static void main(String []args) {
        int n = 5, mid = n/2 + 1;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < 2*n; j++) {
                if(j == n - i + 1 || j == n + i - 1 || (i == mid && j > mid && j < n + mid)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}