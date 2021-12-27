import java.util.Scanner;

public class pyramidpattern26 {

    static void printPattern (int totalLines) {

        int whiteSpaces, printNumber;
        int counter, updateCounter;

        for (int i = 1; i <= totalLines; i++) {

            whiteSpaces = (totalLines - i);
            printNumber = ((2 * i) - 1);

            counter = i;
            updateCounter = 1;

            for (int j = 1; j <= whiteSpaces; j++) {

                System.out.print("  ");
            }

            for (int k = 1; k <= printNumber; k++) {

                System.out.print(counter + " ");

                if (k == i) {

                    updateCounter = -1;
                }

                counter += updateCounter;
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