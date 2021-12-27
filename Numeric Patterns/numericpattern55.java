/**
 * Pattern55
    1 1 1 1 1 
    2 2 2 2 
    3 3 3 
    4 4 
    5 
 */
class numericpattern55 {
    public static void main(String[] args) {
        int rows = 5;
        int index = 1;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(index+" ");
            }
            System.out.println();
            index++;
        }
    }
}