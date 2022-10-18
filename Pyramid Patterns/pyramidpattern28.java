import java.util.Scanner;

class pyramidpattern28 {

    static void printPattern (int totalLines) {

        int whiteSpaces, printNumber, counter = 1;

        for (int i = 1; i <= totalLines; i++) {

            if ((i & 1) == 0) {

                System.out.println();
                continue;
            }

            whiteSpaces = (totalLines - i);
            printNumber = ((2 * i) - 1);

            for (int j = 1; j <= whiteSpaces; j++) {

                System.out.print("  ");
            }

            for (int k = 1; k <= printNumber; k++) {

                if ((k & 1) == 1) {

                    if (counter <= 3) {

                        System.out.print((counter * counter) + " ");
                        counter++;
                    } else {

                        System.out.print((counter * counter));
                        counter++;
                    }

                } else {

                    System.out.print("  ");
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