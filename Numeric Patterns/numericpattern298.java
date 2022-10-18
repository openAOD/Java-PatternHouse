class numericpattern298 {

    public static void main(String []args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < n*2; j++) {
                if(j <= n - i + 1) {
                    System.out.print(j + " ");
                }
                else if(j >= n + i - 1) {
                    System.out.print(n*2 - j + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}