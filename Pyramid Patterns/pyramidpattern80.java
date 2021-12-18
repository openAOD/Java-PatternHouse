
import java.util.Scanner;

public class pyramidpattern80 {

    static void printLeftTriangle (int total, int itr) {

        for (int i = total; i >= 1; i--) {

            if (i <= itr) {

                System.out.print("* ");
            } else {

                System.out.print("  ");
            }
        }
    }

    static void printRightTriangle (int total) {

        for (int i = 1; i <= total; i++) {

            System.out.print("* ");
        }
    }

    static void printPattern (int totalLines) {

        for (int i = 1; i <= totalLines; i++) {

            printLeftTriangle(totalLines, i);
            printRightTriangle(i);

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