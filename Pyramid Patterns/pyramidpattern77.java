
import java.util.Scanner;

class pyramidpattern77 {

    static void printWhiteSpace (int total) {

        for (int j = 1; j <= total; j++) {

            System.out.print(" ");;
        }
    }

    static void printTriangle (int lines) {

        for (int i = 1; i <= lines; i++) {

            if ((i & 1) == 1) {

                System.out.print("*");
            } else {

                System.out.print(" ");
            }
        }
    }

    static void printPattern (int totalLines) {

        int whiteSpaces, printStar;

        for (int i = 1; i <= totalLines; i++) {

            whiteSpaces = (totalLines - i);
            printStar = ((2 * i) - 1);

            printWhiteSpace (whiteSpaces);
            printTriangle (printStar);

            printWhiteSpace (whiteSpaces);
            System.out.print(" ");

            printWhiteSpace (whiteSpaces);
            printTriangle (printStar);

            System.out.println();
        }

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