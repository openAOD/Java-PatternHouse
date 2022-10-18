import java.util.Scanner;

class pyramidpattern66 {

    static boolean ifNumber (int itr) {

        if ((itr & 1) == 0) {

            return false;
        } else {

            return true;
        }
    }

    static void printPattern (int totalLines) {

        int whiteSpaces, printStar, itr = 1;
        boolean number, star;

        for (int i = totalLines; i >= 1; i--) {

            number = ifNumber(itr);
            star = (!number);

            whiteSpaces = (totalLines - i);
            printStar = ((2 * i) - 1);

            for (int j = 1; j <= whiteSpaces; j++) {

                System.out.print(" ");
            }

            for (int k = 1; k <= printStar; k++) {

                if((k & 1) != 0 && number) {

                    System.out.print(i);
                } else if ((k & 1) != 0 && star){

                    System.out.print("*");
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