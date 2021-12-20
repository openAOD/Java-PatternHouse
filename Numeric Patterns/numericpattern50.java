/**
 * Pattern50
    0 
    1 1 
    0 0 0 
    1 1 1 1 
    0 0 0 0 0 
    1 1 1 1 1 1 
 */
class numericpattern50 {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }  
}