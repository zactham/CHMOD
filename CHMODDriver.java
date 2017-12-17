import java.util.ArrayList;
public class CHMODDriver 
{
	public static void main (String[]args)
	{
		for (int counter = 0; counter < 5; counter++)
		{
			CHMOD c = new CHMOD();
			ArrayList <Integer> octal = new ArrayList <Integer> (3);
			

			c.inputOctals();
			c.printOctals();

			//c.inputBinaries();
			//c.printBinaries();

			//c.inputCharacters();
			//c.printCharacters();


			//octalConverter(octal);
			//charConverter(binary);

			//octalConverter(octal);
			//charConverter(binary);

			//binaryConverter(binary);
			//charConverter(binary);

			//charConverter(binary);
			//binaryConverter(binary);
		}

	}
}
