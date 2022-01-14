public class numericpattern172
{
	public static void main(String[] args) {
		
		int n = 5, x = 1, y, t = 1;
        for(int i = 1; i < n; i++) {
        y = t;
        for(int j = 1; j <= i; j++) {
            if(i % 2 == 1)
                System.out.print(x);
            else
                System.out.print(y);
            if(j != i)
                System.out.print("*");
            x++;
            y--;
        }
        t += i + 1;
        System.out.println();
   }
		
		
	}
}