class numericpattern86
{
	public static void main(String[] args) {
		
    int n = 5, x = n, y, num;
    for(int i = n; i >= 1; i--) {
        num = x;
        y = i + 1;

        for(int s = 1; s < i; s++) 
            System.out.print("   ");

        for(int j = n; j >= i; j--){
            System.out.print(num+" ");
            num -= y;
            y++;
        }
        x += i - 1;
        System.out.println();
   }
		
	}
}