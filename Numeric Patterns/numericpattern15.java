public class numericpattern15 {

    public static void main(String []args) {
        int n = 5, num;
        for(int i = 1; i <= n; i++) {
            num = i;
            for(int j = 1; j <= n; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
    
}