import java.util.Scanner;

public class pyramidpattern8 {

    static void printPattern (int totalLines) {

        int whiteSpaces, printStar;
        int counter;

        for (int i = totalLines; i >= 1; i--) {

            whiteSpaces = (totalLines - i);
            printStar = ((2 * i) - 1);

            counter = i;

            for (int j = 1; j <= whiteSpaces; j++) {

                System.out.print(" ");
            }

            for (int k = 1; k <= printStar; k++) {

                if((k & 1) != 0) {

                    System.out.print(counter--);
                } else {

                    System.out.print(" ");
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
