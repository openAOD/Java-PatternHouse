import java.util.Scanner;

class pyramidpattern57 {

    static void printWhitespace (int totalLines) {

        for (int i = 1; i <= totalLines; i++) {

            System.out.print("  ");
        }
    }

    static void printNumber (int totalLines, int counter) {

        char Character = (char)(65 + counter);

        for (int i = totalLines; i >= 1; i--) {

            System.out.print(Character-- + " ");
        }
    }

    static void printPattern (int totalLines) {

        int counter;

        for (int i = 1; i <= totalLines; i++) {

            counter = (totalLines - 1);

            printWhitespace((totalLines - i));
            printNumber(i, counter);

            System.out.println();
        }

        for (int i = (totalLines - 1); i >= 1; i--) {

            counter = (totalLines - 1);

            printWhitespace((totalLines - i));
            printNumber(i, counter);

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