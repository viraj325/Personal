//Viraj Patel

/*Program: This program will get an input(names, numbers) by the hospital employee and the input data will be stored in a arraylist
which will later be edited based on the patients transfer(whether he will go home or at another hospital). This program will also
generate a 5 digit number so the patients family can retrieve hospital room number and operation details and later will be reused
for another patient.*/

/*Future Updates: Adding stored memory probably using SQL.
-For having personal docter numbers so even docters can have the date transfer on their phone
*/

import java.util.*;
import java.io.*;

public class HospitalTestTest
{
//This method will upload file saved data into the arraylist
	public static ArrayList<hospitalInfo> readInventory()
	{
		ArrayList<hospitalInfo> original = new ArrayList<hospitalInfo> ();

		Scanner input = null;

		try
		{
			input = new Scanner (new File ("Output.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("*** Cannot open the data file *****");
			System.exit(1);
		}

		String fn;
		String ln;
		String pn;

		do
		{
			fn = input.next();
			ln = input.next();
			pn = input.next();

			original.add(new hospitalInfo(fn, ln, pn));
		}
		while(input.hasNext());
		return original;
	}

//This method is for saving the current arraylist into a textpad
	public static void saveInventory(ArrayList<hospitalInfo> nn)throws IOException
	{
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Output.txt"))))   {
		     for(hospitalInfo b:nn)
		     {
		         out.print(b.getPatientName()+ " ");
		         out.print(b.getLastPatientName() + " ");
		         out.print(b.getPhoneNumber() + " ");
		     }
		    }catch (IOException e) {
		       System.out.println(e);
    }
	}

//This method is so for adding info to the arraylist as a  whole
	public static void increaseInventory(ArrayList<hospitalInfo> nn)
	{
		Scanner keyboard = new Scanner(System.in);

		String name;
		int number;
		String answerFirstName;
		String answerLastName;
		String answerPhoneNumber;

		System.out.println("How many inputs: ");
			int inputs = keyboard.nextInt();

		for(int i = 0; i < inputs; i++)
		{
			System.out.println("Enter First Name: ");
				answerFirstName = keyboard.next();

			System.out.println("Enter Last Name: ");
				answerLastName = keyboard.next();

			System.out.println("Enter Phone Number: ");
				answerPhoneNumber = keyboard.next();

			nn.add(new hospitalInfo(answerFirstName, answerLastName, answerPhoneNumber));

			System.out.println();
		}
	}

//This method is to print what's in the arraylist
	public static void printInventory(ArrayList<hospitalInfo> c)
	{
		for(int x = 0; x < c.size(); x++)
		{
			System.out.println("Patient #" + (x + 1));
			System.out.print(c.get(x));
		}
		System.out.println();
	}

//This method is to remove a specific spot from the array
	public static void removeInventory(ArrayList<hospitalInfo> nn)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Patient Number: ");
			int numRemove = keyboard.nextInt();

		nn.remove(numRemove - 1);

		System.out.println();
	}

//**************MAIN METHOD**********************
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);

		//ArrayList for patient names and patient phone numbers and thier random number
		ArrayList<hospitalInfo> Info = new ArrayList<hospitalInfo>();

		String one;

		do
		{
			System.out.println("Options(Increase, Print, Remove, Save, Search, Open, Exit): ");
				one = keyboard.next();
					if(one.equals("Increase"))
					{
						increaseInventory(Info);
					}
					else if(one.equals("Print"))
					{
						Info = readInventory();
						printInventory(Info);
					}
					else if(one.equals("Remove"))
					{
						removeInventory(Info);
					}
					else if(one.equals("Save"))
					{
						try
						{
							saveInventory(Info);
						}
						catch(Exception e)
						{
							System.out.println("Saved");
						}
					}
		}
		while(!(one.equals("Exit")));
	}
}