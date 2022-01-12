public class Main
{
	public static void main(String[] args) {
		
	int n = 5, x = 1, y, num;
    for(int i = n; i >= 1; i--) {
        y = i;
        num = x;

        for(int s = 1; s < i; s++) 
            System.out.print("   ");

        for(int j = n; j >= i; j--){
            System.out.print(num+" ");
            num -= y;
            y++;
        }
        x+= i;
        System.out.println();
   }
		
	}
}