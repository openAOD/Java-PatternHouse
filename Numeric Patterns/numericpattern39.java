class numericpattern39 {

    public static void main(String []args) {
        int n = 5, x = 1, y = n, num1, num2, t1, t2;
        for(int i = n; i >= 1; i--) {
            num1 = x;
            num2 = y;
            t1 = i;
            t2 = i + 1;
            
            for(int j = n; j >= i; j--) {
                if((i + j) % 2 == 0) { 
                    System.out.printf("%2d ", num1);
                }
                else {
                    System.out.printf("%2d ", num2);
                }
                num1 = num1 - t1++;
                num2 = num2 - t2++;
            }

            y += i - 1;
            x += i;
            System.out.println();
        }
    }
    
}