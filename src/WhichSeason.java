import java.util.Scanner;
/**
 * 
 * @author Casey Capetola
 *
 */
public class WhichSeason 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Enter the numerical value of your birthmonth: ");
		int birthMonth = Integer.parseInt(user.nextLine());
		
		if(birthMonth>=3 && birthMonth<=5)
		{
			System.out.print("\nYou were born in spring.");
		}
		
		else if(birthMonth>=6 && birthMonth<=8)
		{
			System.out.print("\nYou were born in summer.");
		}
		else if(birthMonth>=9 && birthMonth<=11)
		{
			System.out.print("\nYou were born in autumn.");
		}
		else if(birthMonth==12 || birthMonth<=2 && birthMonth>=1)
		{
			System.out.print("\nYou were born in winter.");
		}
		else
		{
			System.out.print("\nThe number you entered is invalid.");
		}

	}

}
