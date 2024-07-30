import java.util.*;
public class first
{
	public static void main(String [] args)
	{
		Scanner viraj = new Scanner(System.in);

			String name;

		System.out.println("Hello, please enter your name: ");
			name = viraj.nextLine();

			double number;

		System.out.println("Please enter your age: ");
			number = viraj.nextDouble();

			int favoriteNumber;

		System.out.println("Please enter your favorite number: ");
			favoriteNumber = viraj.nextInt();

		if (favoriteNumber >= 10)
		{
			System.out.println("Good choice");
		}
		else if (favoriteNumber <= 10)
		{
			System.out.println("Ok");
		}

		System.out.println("Congratulation " + name + ", you will have $" + favoriteNumber + " billion within " + (int)number + " years!!");
	}
}