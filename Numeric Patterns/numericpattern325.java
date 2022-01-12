public class numericpattern325 {
    
    public static void main(String[] args) {

        int num = 5;
        boolean isRigh = false;

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
                System.out.print(num + " ");
                for (int j = 1; j < num - 1; j++) {
                    System.out.print("  ");
                }
                if (isRigh) {
                    System.out.println(num);
                } else {
                    isRigh = true;
                    System.out.println("  ");
                }
            }
        }
    }
}
