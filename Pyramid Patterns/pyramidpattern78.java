
import java.util.Scanner;

public class pyramidpattern78 {

    static void printLeftDigits (int total) {

        for (int j = 1; j <= total; j++) {

            System.out.printf("%2d ", j);
        }
    }

    static void printRightDigits (int total) {

        for (int j = total; j >= 1; j--) {

            System.out.printf("%2d ", j);
        }
    }

    static void printTriangle (int lines) {

        for (int i = 1; i <= lines; i++) {

            System.out.print(" * ");
        }
    }

    static void printPattern (int totalLines) {

        int totalDigits, printStar;

        for (int i = 1; i <= totalLines; i++) {

            totalDigits = (totalLines - i);
            printStar = ((2 * i) - 1);

            printLeftDigits (totalDigits);
            printTriangle (printStar);
            printRightDigits (totalDigits);

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