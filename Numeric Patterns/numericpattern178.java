public class numericpattern178
{
	public static void main(String[] args) {
		
		int n = 4, x = 1, y, sum = n*(n+1)/2;
    for(int i = 1; i <= n; i++) {
        y = sum - n + i;
        for(int j = 1; j <= n * 2; j++) {
            if(j > 2 * (i - 1)){
                if(j <= (n * 2)/2 + i - 1)
                    System.out.print(x++);
                else
                    System.out.print(y++);
            }
        }
        sum -= (n-i+1);
       System.out.println();
   }
		
	}
}