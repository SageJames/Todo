/*
 * This is the the interface for the todo class
 * Its job is to allow the user to pick what they want it do in the main interface.
 * @author(Alcinder Lewis)
 * @version(1.0)
 */
import java.util.Scanner;
public class todo
{
	public todo()
	{
		boolean leave = true;
		Scanner kb = new Scanner(System.in);
		System.out.println(" ________                 _______            ");
		System.out.println("/        |               /       \\          ");
		System.out.println("$$$$$$$$/______          $$$$$$$  |  ______  ");
		System.out.println("   $$ | /      \\  ______ $$ |  $$ | /      \\");
		System.out.println("   $$ |/$$$$$$  |/      |$$ |  $$ |/$$$$$$  |");
		System.out.println("   $$ |$$ |  $$ |$$$$$$/ $$ |  $$ |$$ |  $$ |");
		System.out.println("   $$ |$$ |__$$ |        $$ |__$$ |$$ |__$$ |");
		System.out.println("   $$ |$$    $$/         $$    $$/ $$    $$/ ");
		System.out.println("   $$/  $$$$$$/          $$$$$$$/   $$$$$$/  ");
		System.out.println("---------------------------------------------");
		System.out.println("");
		while(leave)
		{
			int pick = choice();
			switch(pick)
			{
				case(1):
					//If you want to make a new entry
					break;
				case(2):
					//If you want a list of output
					break;
				case(3):
					//If you want to make class section
					break;
				case(4):
					//List all the things dues today
					break;
				case(5):
					//Exit
					System.out.println("Have a nice day :>");
					leave = false; 
					break;
			}
			if(leave)
				break;
		}
	}

	public static int choice()
	{
		Scanner kb = new Scanner(System.in);	
		System.out.println("What would like to do?");
		System.out.println("______________________");
		System.out.println("*  MAKE NEW ENTRY [1]");
		System.out.println("*  LIST ENTRY [2]"); 
		System.out.println("*  MAKE A CLASS SECTION [3]"); 
		System.out.println("*  LIST ALL IMPORTANT EVENTS [4]");
		System.out.println("*  EXIT [5]");
		System.out.print("***");
		int number = kb.nextInt();
		return number;
	}

}
