import java.util.Scanner;

class pyramidpattern43 {

    static void printUpperHalf (int totalLines) {

        for (int i = 1; i <= totalLines; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");;
            }

            System.out.println();
        }
    }

    static void printLowerHalf (int totalLines) {

        for (int i = totalLines; i >= 1; i--) {

            for (int j = i; j >= 1; j--) {

                System.out.print("* ");
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