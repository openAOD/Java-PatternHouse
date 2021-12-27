
import java.util.Scanner;

public class pyramidpattern79 {

    static void printPattern (int totalLines) {

        int nextColumn = (totalLines - 1), printDigit;
        int itr = 1, counter;

        for (int i = totalLines; i >= 1; i--) {

            counter = itr;

            for (int j = 1; j <= totalLines; j++) {

                if (j >= i) {

                    System.out.printf("%2d ", counter++);
                } else {

                    System.out.print(" * ");
                }
            }

            counter -= 2;

            for (int k = 1; k <= nextColumn; k++) {

                if (k < itr) {

                    System.out.printf("%2d ", counter--);
                } else {

                    System.out.print(" * ");
                }
            }

            itr++;
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