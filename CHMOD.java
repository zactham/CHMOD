//Zac Thamer
//Period 3
//12/8/15
//Converts octal digits, binary digits and characters to their counterparts
import java.util.Scanner;
import java.util.ArrayList;
public class CHMOD 
{
	static Scanner input = new Scanner (System.in);//standard input

	//all of the class variables
	private static ArrayList <Integer> octal = new ArrayList <Integer> (3);
	private static ArrayList <Integer> octal2 = new ArrayList <Integer> (3);
	private static ArrayList <String> binary = new ArrayList <String> (3);
	private static ArrayList <String> binary2 = new ArrayList <String> (3);
	private static ArrayList <String> character = new ArrayList <String> (3);
	private static ArrayList <String> binString = new ArrayList <String> (3);
	static String binaryString = null;

	//DESC: Gets the octal digit input
	// INPUT: list (the empty octal arrayList)
	// OUTPUT: list (the now full of inputs arrayList)
	private static ArrayList<Integer> inputOctal (ArrayList <Integer> list)
	{
		for (int counter = 0; counter<3; counter++)
		{
			System.out.print("Octal Digit: ");
			int octalDigit = input.nextInt();
			list.add(octalDigit);
		}
		return list;
	}

	//DESC: Gets the binary digit input
	// INPUT: list (the empty binary arrayList)
	// OUTPUT: list (the now full of inputs arrayList)
	public static ArrayList<String> inputBinary (ArrayList <String> list)
	{
		System.out.println();
		for (int counter = 0; counter<3; counter++)
		{
			System.out.print("Binary Digit: ");
			String binaryDigit = input.next();
			list.add(binaryDigit);
		}
		return list;
	}

	//DESC: Gets the character input
	// INPUT: list (the empty character arrayList)
	// OUTPUT: list (the now full of inputs arrayList)
	public static ArrayList<String> inputChar (ArrayList <String> list)
	{
		System.out.println();
		for (int counter = 0; counter<3; counter++)
		{
			String charDigit;
			do 
			{
				System.out.print("Character: ");
				charDigit = input.next();
			}
			while(!charDigit.contains("r")&&!charDigit.contains("w")&&!charDigit.contains("x"));//checks to make sure the input is the correct format
			list.add(charDigit);
		}
		return list;
	}

	//DESC: Sets a string to the binary digit equivalent of the octal digit, then prints it
	// INPUT: list (the list full of octal digits)
	// OUTPUT: none
	public static void octalConverter(ArrayList <Integer> list)
	{
		for (int counter = 0; counter < 3; counter++)
		{
			if (list.get(counter) == 0)
			{
				binaryString = "000 ";
			}
			else if (list.get(counter) == 1)
			{
				binaryString = "001 ";
			}
			else if (list.get(counter) == 2)
			{
				binaryString = "010 ";
			}
			else if (list.get(counter) == 3)
			{
				binaryString = "011 ";
			}
			else if (list.get(counter) == 4)
			{
				binaryString = "100 ";
			}
			else if (list.get(counter) == 5)
			{
				binaryString = "101 ";
			}
			else if (list.get(counter) == 6)
			{
				binaryString = "110 ";
			}
			else if (list.get(counter) == 7)
			{
				binaryString = "111 ";
			}
			System.out.print(binaryString);
		}
	}

	//DESC: Sets a string to the binary digit equivalent of the octal digit, then prints it, then converts it to the matching character
	// INPUT: list (the list full of octal digits)
	// OUTPUT: none
	public static void octalBinaryConverter(ArrayList <Integer> list)
	{
		for (int counter = 0; counter < 3; counter++)
		{
			if (list.get(counter) == 0)
			{
				binaryString = "000 ";
			}
			else if (list.get(counter) == 1)
			{
				binaryString = "001 ";
			}
			else if (list.get(counter) == 2)
			{
				binaryString = "010 ";
			}
			else if (list.get(counter) == 3)
			{
				binaryString = "011 ";
			}
			else if (list.get(counter) == 4)
			{
				binaryString = "100 ";
			}
			else if (list.get(counter) == 5)
			{
				binaryString = "101 ";
			}
			else if (list.get(counter) == 6)
			{
				binaryString = "110 ";
			}
			else if (list.get(counter) == 7)
			{
				binaryString = "111 ";
			}

			//binary to character
			if (binaryString == "000 ")
			{
				System.out.print("--- ");
			}
			else if (binaryString == "001 ")
			{
				System.out.print("--x ");
			}
			else if (binaryString == "010 ")
			{
				System.out.print("-w- ");
			}
			else if (binaryString == "011 ")
			{
				System.out.print("-wx ");
			}
			else if (binaryString == "100 ")
			{
				System.out.print("r-- ");
			}
			else if (binaryString == "101 ")
			{
				System.out.print("r-x ");
			}
			else if (binaryString == "110 ")
			{
				System.out.print("rw- ");
			}
			else if (binaryString == "111 ")
			{
				System.out.print("rwx ");
			}
		}
		System.out.println();
	}

	//DESC: Prints the octal equivalent of the binary digit
	// INPUT: list (the list full of binary digits)
	// OUTPUT: none
	public static void binaryConverter(ArrayList <String> list)
	{
		for (int counter = 0; counter < 3; counter++)
		{
			if (list.get(counter).equals ("000"))
			{
				System.out.print("0");
			}
			else if (list.get(counter).equals ("001"))
			{
				System.out.print("1");
			}
			else if (list.get(counter).equals ("010"))
			{
				System.out.print("2");
			}
			else if (list.get(counter).equals ("011"))
			{
				System.out.print("3");
			}
			else if (list.get(counter).equals ("100"))
			{
				System.out.print("4");
			}
			else if (list.get(counter).equals ("101"))
			{
				System.out.print("5");
			}
			else if (list.get(counter).equals ("110"))
			{
				System.out.print("6");
			}
			else if (list.get(counter).equals ("111"))
			{
				System.out.print("7");
			}
		}
		 System.out.print(" ");
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

	//DESC: Adds the binary digit equivalent to the character
	// INPUT: list (the list full of character digits)
	// OUTPUT: none
	public static void charConverterOctal(ArrayList <String> list)
	{
		for (int counter = 0; counter < 3; counter++)
		{
			if (list.get(counter).equals ("---"))
			{
				binString.add("000");
			}
			else if (list.get(counter).equals ("--x"))
			{
				binString.add("001");
			}
			else if (list.get(counter).equals ("-w-"))
			{
				binString.add("010");
			}
			else if (list.get(counter).equals ("-wx"))
			{
				binString.add("011");
			}
			else if (list.get(counter).equals ("r--"))
			{
				binString.add("100");
			}
			else if (list.get(counter).equals ("r-x"))
			{
				binString.add("101");
			}
			else if (list.get(counter).equals ("rw-"))
			{
				binString.add("110");
			}
			else if (list.get(counter).equals ("rwx"))
			{
				binString.add("111");
			}
		}
	}

	public static void main(String[]args)
	{
		//for (int counter = 0; counter<5; counter++)

		{
			inputOctal(octal);// octal input
			octalConverter(octal);//binary
			System.out.print("and ");
			octalBinaryConverter(octal);//char
			System.out.println();
			
			inputOctal(octal2);// octal input
			octalConverter(octal2);//binary
			System.out.print("and ");
			octalBinaryConverter(octal2);//char

			inputBinary(binary);// binary input
			binaryConverter(binary);//octal
			System.out.print("and ");
			charConverter(binary);

			inputBinary(binary2);//binary input
			binaryConverter(binary2);//octal
			System.out.print("and ");
			charConverter(binary2);//char

			inputChar(character);// char input
			charConverterOctal(character);//(first to binary)
			binaryConverter(binString);//octal
			System.out.print("and ");
			System.out.print(binString.get(0)+ " ");//prints the first part of binary
			System.out.print(binString.get(1)+ " ");//prints the second part of binary
			System.out.print(binString.get(2));//prints the third part of binary
		}
	}
}
