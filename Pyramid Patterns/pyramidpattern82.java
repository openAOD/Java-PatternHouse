
import java.util.Scanner;

class pyramidpattern82 {

    static void printDigitTriangle (int total, int itr) {

        int counter = 1;

        for (int i = total; i >= 1; i--) {

            if (i <= itr) {

                System.out.printf("%2d ", counter++);
            } else {

                System.out.print("   ");
            }
        }
    }

    static void printAlphabetTriangle (int total) {

        char Alphabet = 'A';

        for (int i = 1; i <= total; i++) {

            System.out.print(" " + Alphabet++ + " ");
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