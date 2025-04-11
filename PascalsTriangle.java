/**
* Write a description of class PascalsTriangle here.
*
* @author (your name)
* @version (a version number or a date)
*/
import java.util.Scanner;
public class PascalsTriangle
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num = 1;
		System.out.println("How many rows would you like in your Pascal's Triangle?");
		int rows = scan.nextInt();
		int maxspaces = rows;


		for(int i = 0; i < rows; i++)
		{
		num = 1;
		for(int spaces = 0; spaces <= maxspaces; spaces++)
		{
		System.out.print(" ");
		}
		for(int j = 0; j <= i; j++)
		{
		System.out.print(num);
		num = num * (i - j)/(j + 1);//found this formula to build triangle online
		if(j>0 || j<i)y
		{
		System.out.print(" ");
		}
		}
		maxspaces--;
		System.out.println("");
		}
	}
}
