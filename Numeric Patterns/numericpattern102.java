/**
 * Pattern102
 *      5
       456
      34567
     2345678
    123456789
 * 
 */
class numericpattern102 {
    public static void main(String[] args) {
        int rows = 5;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= rows+i; j++) {
                if (j < rows-i) {
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println(); 
                
        }
    }
}
