public class symbolpattern {

    public static void main(String []args) {
        int n = 5, max = 5;
        int a[] = {4, 3, 5, 1, 2};
        
        for(int i = 0; i < max; i++) {
            for(int j = 0; j < n; j++) {
                if(a[j] >= max - i) {
                    System.out.print(" # ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        
        for(int i = 0; i < n; i++) {
            System.out.print("[" + (i+1) + "]");
        }
    }
}