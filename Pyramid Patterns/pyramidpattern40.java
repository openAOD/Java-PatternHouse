import java.util.Scanner;

public class pyramidpattern40 {

    static void printPattern (int totalLines) {

        int whiteSpaces, printAlphabet;
        char character = (char)(64 + totalLines);

        for (int i = totalLines; i >= 1; i--) {

            whiteSpaces = (totalLines - i);
            printAlphabet = ((2 * i) - 1);

            for (int j = 1; j <= whiteSpaces; j++) {

                System.out.print("  ");
            }

            for (int k = 1; k <= printAlphabet; k++) {

                System.out.print(character + " ");
            }

            character--;
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