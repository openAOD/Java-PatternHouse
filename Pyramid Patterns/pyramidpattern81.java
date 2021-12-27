
import java.util.Scanner;

public class pyramidpattern81 {

    static void printDigitTriangle (int total, int itr) {

        for (int i = total; i >= 1; i--) {

            if (i <= itr) {

                System.out.printf("%2d ", itr);
            } else {

                System.out.print("   ");
            }
        }
    }

    static void printAlphabetTriangle (int total) {

        char Alphabet = (char)(64 + total);

        for (int i = 1; i <= total; i++) {

            System.out.print(" " + Alphabet + " ");
        }
    }

    static void printPattern (int totalLines) {

        for (int i = 1; i <= totalLines; i++) {

            printDigitTriangle (totalLines, i);
            printAlphabetTriangle (i);

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