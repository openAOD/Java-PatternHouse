/**
 * Pattern98
 *      1
       333
      55555
     7777777
    999999999
 */
class numericpattern98 {
    public static void main(String[] args) {
        int rows = 5;
        int temp = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print(temp);
            }
            System.out.println();
            temp+=2;
        
        }
    }
}
