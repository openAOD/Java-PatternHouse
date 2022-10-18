class numericpattern177
{
	public static void main(String[] args) {
		for(int i = 5; i >= 1; i--) {
        for(int j = 1; j <= i * 2; j++) {
            if(j <= i)
                System.out.print(j);
            else
                System.out.print(i*2 - j + 1);
        }
        System.out.println();
   }
		
	}
}