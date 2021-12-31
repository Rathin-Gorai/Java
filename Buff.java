import java.io.*;
class Buff
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Name=");
		String name=br.readLine();
		System.out.print("Roll=");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Name="+name+"\nRoll="+a);
	}
}