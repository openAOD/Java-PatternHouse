public class numericpattern173
{
	public static void main(String[] args) {
		
		int n = 4, x = 1, y;
    for(int i = 1; i <= n; i++) {
        y = x + i;
        for(int j = 1; j <= i; j++) {
            if(i % 2 == 1)
                System.out.print(x + j - 1);
            else
                System.out.print(y - j);
            if(j != i + 1)
                System.out.print("# ");
        }
        x += i;
        System.out.println();
   }
		
		
	}
}