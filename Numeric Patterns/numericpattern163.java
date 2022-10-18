class Main
{
	public static void main(String[] args) {
	
    for (int i = 1; i <= 5; i++)
    {
        int c = 1;
        for (int j = 1; j <= i; j++)
        {
            if (i % 2 == 0)
                System.out.print(j * 2 + " ");
            else
            {
                System.out.print(c + " ");
                c += 2;
            }
        }
        System.out.println();
    }
		
	}
}