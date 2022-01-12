import java.util.*;
class StrInput
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name=");
		String name = sc.nextLine();
		System.out.print("Enter Roll no=");
		int roll=sc.nextInt();
		System.out.println("Name= "+name+"\nRoll= "+roll);
		sc.close();
	}
}