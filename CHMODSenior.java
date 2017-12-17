//Zac Thamer
//Period 3
//12/10/15
//Converts octal digits to binary and based on a command entered first, converts it to octal with an exception
import java.util.Scanner;
import java.util.ArrayList;
public class CHMODSenior 
{
	static Scanner input = new Scanner (System.in);//standard input

	//all of the class variables
	private static ArrayList <Integer> octal = new ArrayList <Integer> (4);
	private static ArrayList <String> binString = new ArrayList <String> (4);


	//DESC: Gets the octal digit input
	// INPUT: list (the empty octal arrayList)
	// OUTPUT: list (the now full of inputs arrayList)
	private static ArrayList<Integer> inputOctal (ArrayList <Integer> list)
	{

		for (int counter = 0; counter < 4; counter++)
		{
			System.out.print("Octal Digit: ");
			int octalDigit = input.nextInt();
			list.add(octalDigit);
		}
		return list;
	}
	//DESC: Sets a string to the binary digit equivalent of the octal digit, then prints it
	// INPUT: list (the list full of octal digits)
	// OUTPUT: none
	public static void octalConverter(ArrayList <Integer> list)
	{
		for (int counter = 1; counter < 4; counter++)
		{
			if (list.get(counter) == 0)
			{
				binString.add("000");
			}
			else if (list.get(counter) == 1)
			{
				binString.add("001");
			}
			else if (list.get(counter) == 2)
			{
				binString.add("010");
			}
			else if (list.get(counter) == 3)
			{
				binString.add("011");
			}
			else if (list.get(counter) == 4)
			{
				binString.add("100");
			}
			else if (list.get(counter) == 5)
			{
				binString.add("101");
			}
			else if (list.get(counter) == 6)
			{
				binString.add("110");
			}
			else if (list.get(counter) == 7)
			{
				binString.add("111");
			}
		}
	}

	public static void ifBinarySpecial(int index)
	{
		for (int counter = 0; counter < 1; counter++)
		{
			if (binString.get(index).equals("000"))
			{
				System.out.print("--- ");
			}
			else if (binString.get(index).equals("001"))
			{
				System.out.print("--s ");
			}
			else if (binString.get(index).equals("010"))
			{
				System.out.print("-w- ");
			}
			else if (binString.get(index).equals("011"))
			{
				System.out.print("-ws ");
			}
			else if (binString.get(index).equals("100"))
			{
				System.out.print("r-- ");
			}
			else if (binString.get(index).equals("101"))
			{
				System.out.print("r-s ");
			}
			else if (binString.get(index).equals("110"))
			{
				System.out.print("rw- ");
			}
			else if (binString.get(index).equals("111"))
			{
				System.out.print("rws ");
			}
		}

	}

	public static void ifBinarySpecialT(int index)
	{
		for (int counter = 0; counter < 1; counter++)
		{
			if (binString.get(index).equals("000"))
			{
				System.out.print("--- ");
			}
			else if (binString.get(index).equals("001"))
			{
				System.out.print("--t ");
			}
			else if (binString.get(index).equals("010"))
			{
				System.out.print("-w- ");
			}
			else if (binString.get(index).equals("011"))
			{
				System.out.print("-wt ");
			}
			else if (binString.get(index).equals("100"))
			{
				System.out.print("r-- ");
			}
			else if (binString.get(index).equals("101"))
			{
				System.out.print("r-t ");
			}
			else if (binString.get(index).equals("110"))
			{
				System.out.print("rw- ");
			}
			else if (binString.get(index).equals("111"))
			{
				System.out.print("rwt ");
			}
		}

	}

	public static void ifBinaryNormal(int index, boolean case4, boolean stop)
	{
		int maxCounter = 3;
		if (case4 == true)
		{
			maxCounter = 2;	
		}
		for (int counter = index; counter < maxCounter; counter++)
		{
			//binary to character
			if (binString.get(counter).equals("000"))
			{
				System.out.print("--- ");
			}
			else if (binString.get(counter).equals("001"))
			{
				System.out.print("--x ");
			}
			else if (binString.get(counter).equals("010"))
			{
				System.out.print("-w- ");
			}
			else if (binString.get(counter).equals("011"))
			{
				System.out.print("-wx ");
			}
			else if (binString.get(counter).equals("100"))
			{
				System.out.print("r-- ");
			}
			else if (binString.get(counter).equals("101"))
			{
				System.out.print("r-x ");
			}
			else if (binString.get(counter).equals("110"))
			{
				System.out.print("rw- ");
			}
			else if (binString.get(counter).equals("111"))
			{
				System.out.print("rwx ");
			}
			if (stop == true)
			{
				break;
			}
		}
	}
	//DESC: Sets a string to the binary digit equivalent of the octal digit, then prints it, then converts it to the matching character
	// INPUT: list (the list full of octal digits)
	// OUTPUT: none
	public static void specialPermissions(ArrayList <Integer> list)
	{
		boolean check = false;
		boolean stop = false;
		if (list.get(0) == 0)
		{
			ifBinaryNormal(0, check, stop);
		}

		if (list.get(0) == 1)
		{
			ifBinarySpecial(0);
			ifBinaryNormal(1, check, stop);
		}

		if (list.get(0) == 2)
		{
			stop = true;
			ifBinaryNormal(0, check, stop);
			ifBinarySpecial(1);
			stop = false;
			ifBinaryNormal(2, check, stop);
		}


		if (list.get(0) == 4)
		{
			check = true;
			ifBinaryNormal(0, check, stop);
			ifBinarySpecialT(2);
		}

		System.out.println();
	}



	//DESC: Prints the character equivalent of the binary digit
	// INPUT: list (the list full of character digits)
	// OUTPUT: none
	public static void charConverter(ArrayList <String> list)
	{
		for (int counter = 0; counter < 3; counter++)
		{
			if (list.get(counter).equals ("000"))
			{
				System.out.print("--- ");
			}
			else if (list.get(counter).equals ("001"))
			{
				System.out.print("--x ");
			}
			else if (list.get(counter).equals ("010"))
			{
				System.out.print("-w- ");
			}
			else if (list.get(counter).equals ("011"))
			{
				System.out.print("-wx ");
			}
			else if (list.get(counter).equals ("100"))
			{
				System.out.print("r-- ");
			}
			else if (list.get(counter).equals ("101"))
			{
				System.out.print("r-x ");
			}
			else if (list.get(counter).equals ("110"))
			{
				System.out.print("rw- ");
			}
			else if (list.get(counter).equals ("111"))
			{
				System.out.print("rwx ");
			}
		}
		System.out.println();
	}

	public static void print(ArrayList <String> list)
	{
		for (int counter = 0; counter < list.size(); counter++)
		{
			System.out.print(list.get(counter)+ " ");
		}
	}

	public static void main(String[]args)
	{
		for (int counter = 0; counter<5; counter++)

		{
			octal.clear();
			binString.clear();
			inputOctal(octal);// octal input
			octalConverter(octal);//binary
			print(binString);
			System.out.print("and ");
			specialPermissions(octal);//char
			System.out.println();
		}
	}
}