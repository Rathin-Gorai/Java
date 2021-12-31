class Pyramid_i
{
	public static void main(String args[])
	{
		int i,j;
		for(i=5;i>0;i--)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}