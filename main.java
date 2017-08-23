import java.util.Scanner;
public class PrintAndRemoveName{
	public static void main(String[] args)throws Exception{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a name:");
		String s=scn.nextLine();
		System.out.println(s.length());
		s = s.substring(0, s.length()-3);
		System.out.println(s);
		System.out.println(s.length());
	}
}
