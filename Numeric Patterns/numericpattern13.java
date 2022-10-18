class numericpattern13 {

    public static void main(String []args) {
        int n = 5, num;
        for(int i = 1; i <= n; i++) {
            num = n - i + 1;
            for(int j = 1; j <= n; j++) {
                System.out.printf("%2d ", num);
                num += n;
            }
            System.out.println();
        }
    }
    
}