//pattern to be printed
//    A
//   A B
//  A B C 
// A B C D
//A B C D E


/**
 * alphabeticpattern32
 */
class alphabeticpattern32 {
public static void main(String[] args) {
    int rows = 6;
    alphabetPattern32(rows);
}
private static void alphabetPattern32(int n) {

    int alphabet = 64;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <n-i; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < i; j++) {
        System.out.print((char)(alphabet+j+1)+" ");    
        }
        System.out.println();
    }
}

}
    

