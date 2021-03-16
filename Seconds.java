import java.util.Scanner;

public class Seconds 
{
	public static void main(String[] args)
	{
		// create object of scanner class.
		Scanner in = new Scanner(System.in);

		// enter the seconds here.
		System.out.print("Enter number of seconds : ");

		int seconds = in.nextInt(); 

		int p1 = seconds % 60;
		int p2 = seconds / 60;
		int p3 = p2 % 60;

		p2 = p2 / 60;

		System.out.print("Hours=" + p2 + "Minutes=" + p3 + "Seconds=" + p1);
		System.out.print("\n");
	}  
}