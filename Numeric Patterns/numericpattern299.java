class numericpattern299 {

    public static void main(String []args) {
        int n = 5, x = n;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= x; j++) {
                if(i <= n/2 + 1) {
                    System.out.print(i + j - 1 + " ");
                }
                else {
                    System.out.print(i + j - x + " ");
                }
            }
            if(i <= n/2) {
                x -= 2;
            }
            else {
                x += 2;
            }
            System.out.println();
        }
    }
    
}