public class numericpattern174
{
	public static void main(String[] args) {
		
	for(int i = 5; i >= 1; i--) {
        for(int j = 1; j <= i; j++) {
            if(i % 2 == 1)
                System.out.print(j+" ");
            else
                System.out.print((i + 1 - j) + " ");
        }
        System.out.println();
   }
		
	}
}