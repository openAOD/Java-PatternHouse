class numericpattern301 {

    public static void main(String []args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < 2*n; j++) {
                if(j >= n- i + 1 && j <= n + i - 1) {
                    System.out.print("* ");
                }
                else if(j <= n) {
                    System.out.print(j + " ");
                }
                else {
                    System.out.print(2*n - j + " ");
                }
            }
            System.out.println();
        }
    }
    
}