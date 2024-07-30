import java.util.*;
import java.util.Random;

public class myproject
{
	public static boolean getRandomBoolean()
	{
		return Math.random() < 0.5;
	}
	public static void main(String [] args)
	{
		Scanner viraj = new Scanner(System.in);

		System.out.println("Welcome to BlackJack");
		System.out.println();
		System.out.println("The rule of the game is to get 21 points or more points than the opposing side.");
		System.out.println("If you get 21 when the dealer deals than its an instant win.");

		System.out.println();
		System.out.println("Please select \"Single\" player or \"CO-OP\"");
		System.out.println();

		String answer;
		String move;
		//do and while loop will force the user to only pick between single or coop, add case sensitive later to ignore the lettercase
		do
		{
			System.out.println("Type single or coop");
				answer = viraj.nextLine();

			System.out.println();

			if(answer.equals("single"))
			{
				String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
				//create another array which has the values of each card.
				int[] cardValues = new int[cards.length];
				//still having value issues, use note.
					int x = (int)(Math.random()*13);
					int y = (int)(Math.random()*13);

				System.out.println("Here are your two cards");
				System.out.println();
				System.out.println("     " + cards[x] + "   " + cards[y]);
					int sum = cardValues[x+1] + cardValues[y+1];

				System.out.println();
				System.out.println(sum);
				//When the player stands out put that in a loop and then let the cards of the ai appear.

				do
				{
					System.out.println("Now either type \"Hit\" to draw another card or \"Stand\" to end the turn.");
					System.out.println("Your Move....");
						move = viraj.nextLine();

					System.out.println();

					if(move.equalsIgnoreCase("Hit"))
					{
						int z = (int)(Math.random()*13);

						System.out.println("     " + cards[x] + "   " + cards[y] + "   " + cards[z]);
							sum = cardValues[x] + cardValues[y] + cardValues[z];

						System.out.println(sum);
					}
					else if(move.equals("STAND"))
					{
						int a = (int)(Math.random()*13);
						int b = (int)(Math.random()*13);
						//random boolean for the characteristic of the ai to pick whether to hit or stand.
						boolean random = getRandomBoolean();

						if(random == true)
						{
							int c = (int)(Math.random()*13);

							System.out.println("       " + cards[a] + "   " + cards[b] + "   " + cards[c]);
						}
						else if(random == false)
						{
							System.out.println("       " + cards[a] + "   " + cards[b]);
						}
					}
				}
				while(!(move.equals("HIT")||move.equals("STAND")));
			}
			else if(answer.equals("coop"))
			{
				System.out.println("SORRY UNDER CONSTRUCTION....");
			}
		}
		while(!(answer.equals("single")||answer.equals("coop")));

		/*
			do a do while loop to force the user to either select single or coop
			make sure to use two different methods for the ai option and the single player option
			do everything in different loops
			and try to creater more methods for other rules and keep updating them.
		*/
	}
}