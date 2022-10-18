import java.util.Scanner;

class pyramidpattern27 {

    static int middleSum (int lineNumber, int counter) {

        int sum = 0;

        for (int i = 1; i < lineNumber; i++) {

            sum += counter;
            counter += 2;
        }

        return sum;
    }

    static void printWhiteSpace (int total) {

        for (int j = 1; j <= total; j++) {

            System.out.print("  ");
        }
    }

    static int printNumbers (int total, int counter) {

        int middle = ((total + 1) / 2), initialCounter = counter;

        for (int k = 1; k <= total; k++) {

            if ((k == middle) && (total != 1)) {

                System.out.printf("%3d ", middleSum(total, initialCounter));
            } else {

                System.out.printf("%3d ", counter);
                counter += 2;
            }
        }

        return counter;
    }

    static void printPattern (int totalLines) {

        int whiteSpaces, counter = 1;

        for (int i = 1; i <= totalLines; i++) {

            if ((i & 1) == 0) {

                System.out.println();
                continue;
            }

            whiteSpaces = (totalLines - i);
            printWhiteSpace(whiteSpaces);

            counter = printNumbers(i, counter);
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