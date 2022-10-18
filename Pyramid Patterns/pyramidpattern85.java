
import java.util.Scanner;

class pyramidpattern85 {

    static void printAlphabetTriangle (int total, int itr) {

        char Alphabet = 'A';

        for (int i = total; i >= 1; i--) {

            if (i <= itr) {

                System.out.print(" " + Alphabet++ + " ");
            } else {

                System.out.print("   ");
            }
        }
    }

    static void printDigitTriangle (int total) {

        int counter = 1;

        for (int i = 1; i <= total; i++) {

            System.out.printf("%2d ", counter++);
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