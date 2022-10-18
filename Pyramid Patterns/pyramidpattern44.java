import java.util.Scanner;

class pyramidpattern44 {

    static void printUpperHalf (int totalLines) {

        int counter;

        for (int i = 1; i <= totalLines; i++) {

            counter = (totalLines - 1);

            for (int j = 1; j <= i; j++) {

                System.out.printf("%3d", counter--);;
            }

            System.out.println();
        }
    }

    static void printLowerHalf (int totalLines) {

        int counter;

        for (int i = totalLines; i >= 1; i--) {

            counter = totalLines;

            for (int j = 1; j <= i; j++) {

                System.out.printf("%3d", counter--);
            }

            System.out.println();
        }
    }

    static void printPattern (int totalLines) {

        printUpperHalf(totalLines);
        printLowerHalf((totalLines - 1));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int totalLines;

        System.out.print("How many lines to be printed? --> ");
        totalLines = input.nextInt();

        System.out.println("\nYour pattern looks like this:\n");
        printPattern (totalLines);
    }
}