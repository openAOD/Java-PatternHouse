import java.util.Scanner;

class pyramidpattern70 {

    static boolean ifNumber (int itr) {

        if ((itr & 1) == 0) {

            return false;
        } else {

            return true;
        }
    }

    static void printPattern (int totalLines) {

        int whiteSpaces, printStar, itr = 1, counter;
        boolean number, character;

        char alphabet;

        for (int i = 1; i <= totalLines; i++) {

            number = ifNumber(itr);
            character = (!number);

            alphabet = 'A';
            counter = 1;

            whiteSpaces = (totalLines - i);
            printStar = ((2 * i) - 1);

            for (int j = 1; j <= whiteSpaces; j++) {

                System.out.print("  ");
            }

            for (int k = 1; k <= printStar; k++) {

                if((k & 1) != 0 && number) {

                    System.out.printf("%3d", counter++);
                } else if ((k & 1) != 0 && character){

                    System.out.print("  " + alphabet++);
                } else {

                    System.out.print(" ");
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