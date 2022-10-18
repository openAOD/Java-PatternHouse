
import java.util.Scanner;

class pyramidpattern84 {

    static void printDigitTriangle (int total) {

        for (int i = total; i >= 1; i--) {

            System.out.printf("%2d ", total);
        }
    }

    static void printAlphabetTriangle (int total, int itr) {

        char Alphabet = (char)(64 + itr);

        for (int i = total; i >= 1; i--) {

            if (i <= itr) {

                System.out.print(" " + Alphabet + " ");
            } else {

                System.out.print("   ");
            }
        }
    }

    static void printPattern (int totalLines) {

        for (int i = 1; i <= totalLines; i++) {

            printAlphabetTriangle (totalLines, i);
            printDigitTriangle (i);

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