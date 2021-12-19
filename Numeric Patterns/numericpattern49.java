/**
 * Pattern49
    1 
    0 0 
    1 1 1 
    0 0 0 0 
    1 1 1 1 1 
 */
class numericpattern49 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i<= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}