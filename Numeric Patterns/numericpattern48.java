/** 
 * Pattern48
    0
    0 1 
    0 1 1 
    0 1 1 2 
    0 1 1 2 3 
*/
class numericpattern48{
    public static void main(String[] args){
        int rows = 5;
        int N = rows*(rows+1)/2;
        int fib[] = new int[N+1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= N; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        for (int j = 1; j <= rows; j++) {
            int index = 0;
            for (int k = 1; k <= j; k++) {
                System.out.print(fib[index++]+" ");
            }
            System.out.println();
        }
    }
}