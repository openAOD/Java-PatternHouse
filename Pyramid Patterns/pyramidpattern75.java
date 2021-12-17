import java.util.Scanner;

public class pyramidpattern75 {

    static void printPattern (int totalLines) {

        int whiteSpaces, printStar, counter = 1;
        boolean number = true;

        char alphabet = 'A';

        for (int i = 1; i <= totalLines; i++) {

            whiteSpaces = (totalLines - i);
            printStar = ((2 * i) - 1);

            for (int j = 1; j <= whiteSpaces; j++) {

                System.out.print("  ");
            }

            for (int k = 1; k <= printStar; k++) {

                if(number) {

                    counter %= 10;

                    if(counter == 0) {
                        counter++;
                    }

                    System.out.print(counter++ + " ");
                } else {

                    if(alphabet == '[') {
                        alphabet = 'A';
                    }

                    System.out.print(alphabet++ + " ");
                }
            }

            number = (!number);
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