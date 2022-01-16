public class numericpattern325 {
    
    
      /*    6 6 6 6 6
            6
            6 6 6 6 6
            6       6
            6 6 6 6 6   */
    
    
    public static void main(String[] args) {

        int num = 5;
        boolean isRigh = false;
        int value=6;

        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < num; j++) {
                    if (j < 4) {
                        System.out.print(value + " ");
                    } else {
                        System.out.println(value);
                    }
                }
            } else {
                System.out.print(value + " ");
                for (int j = 1; j < num - 1; j++) {
                    System.out.print("  ");
                }
                if (isRigh) {
                    System.out.println(value);
                } else {
                    isRigh = true;
                    System.out.println("  ");
                }
            }
        }
    }
}
