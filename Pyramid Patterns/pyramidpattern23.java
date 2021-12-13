import java.util.Scanner;

public class pyramidpattern23 {

    static void printPattern (int totalLines) {

        int whiteSpaces, printStar;
        int counter;
        float updateCounter;

        for (int i = 1; i <= totalLines; i++) {

            whiteSpaces = (totalLines - i);
            printStar = ((2 * i) - 1);

            counter = 1;
            updateCounter = 2.0F;

            for (int j = 1; j <= whiteSpaces; j++) {

                System.out.print("  ");
            }

            for (int k = 1; k <= printStar; k++) {

                System.out.print(counter + " ");

                if (k == i) {

                    updateCounter = 0.5F;
                }

                counter *= updateCounter;
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