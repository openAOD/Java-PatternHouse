import java.util.Scanner;

class pyramidpattern88 {

    static void printPattern (int totalLines) {

        int whiteSpaces, middle;
        char bracket;

        for (int i = 1; i <= totalLines; i++) {

            bracket = '(';

            whiteSpaces = (totalLines - i);
            middle = (((2 *i + 1) + 1) / 2);

            for (int j = 1; j <= whiteSpaces; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= ((2 *i + 1)); k++) {

                if (k == middle) {

                    System.out.print("+");
                    bracket = ')';
                } else {

                    System.out.print(bracket);
                }
            }

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