class alphabeticpattern154 {

/*        * * * * *
          *       *
          *       *
          *       *
          * * * * *      */


    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;

        for (int i = 0; i < rows; i++) {
            System.out.print("* ");
            for (int j = 1; j < columns - 1; j++) {
                if (i == 0 || i == rows - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("*");
        }
    }
}
