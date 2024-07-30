import java.util.*;

public class virajsomething
{
	public static void main(String [] args)
	{
		Scanner viraj = new Scanner(System.in);

		int myPoints = 0;

		int yourPoints = 0;

		for(int x = 1; x <= 10; x++)
		{
			int myNumber = (int)(Math.random()*9)+1;

			int yourNumber = (int)(Math.random()*9)+1;

			System.out.println("My number is " + myNumber);

			System.out.println("Your number is " + yourNumber);

			if (yourNumber > myNumber)
			{
				System.out.println("Rashmi Wins!!");
					yourPoints++;
			}
			else if (myNumber > yourNumber)
			{
				System.out.println("Viraj Wins!!");
					myPoints++;
			}
			else
			{
				System.out.println("It's a Tie!!");
			}
				System.out.println();
				System.out.println();

				System.out.println("My points = " + myPoints);

				System.out.println("Your points = " + yourPoints);

				System.out.println();
				System.out.println();
			}
	}
}