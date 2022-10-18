class numericpattern324 {
    
    
/* 5 5 5 5 5
   5
   5 5 5 5 5
           5
   5 5 5 5 5 */


    public static void main(String[] args) {

        int num = 5;
        boolean isLeft = true;

        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < num; j++) {
                    if (j < 4) {
                        System.out.print(num + " ");
                    } else {
                        System.out.println(num);
                    }
                }
            } else {
                if (isLeft) {
                    isLeft = false;
                    System.out.println(num);
                } else {
                    for (int j = 0; j < num - 1; j++) {
                        System.out.print("  ");
                    }
                    System.out.println(num);
                }
            }
        }
    }
}
