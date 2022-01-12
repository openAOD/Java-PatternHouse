public class numericpattern84
{
	public static void main(String[] args) {
		
	int n = 5, x = 1, y = n, n1, n2, d1, d2;
    for(int i = n; i >= 1; i--) {
        n1 = x;
        n2 = y;
        d1 = i;
        d2 = i + 1;

        for(int s = 1; s < i; s++) 
            System.out.print("   ");

        for(int j = n; j >= i; j--){
            if((i + j) % 2 == 0)
               System.out.print(n1+" ");
            else
                System.out.print(n2+" ");
            n1 = n1 - d1++;
            n2 = n2 - d2++;
        }
        y += i - 1;
        x += i;
        System.out.println();
   }
		
	}
}