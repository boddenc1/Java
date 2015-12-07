package encrypt;
import java.util.Scanner;

public class driver {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("What letter/phrase would you like to convert");
		
		char[] symarray = {' ',':',';','.','-', '!','?'};
		char[] encrypted = {'~','-','^','&','$','(',')'};
		
		String str = sc.nextLine(); // No Scanner parse for Char, bring in as String
		
		
		str = str.toLowerCase(); // Since there 2 Values for each number, we make it easier and only deal with lowercase
		char [] charArray = str.toCharArray();// To handle each letter, we convert the String into a Array of chars
		
		
		System.out.println("How many shifts?"); //How many letter shifts does the user want
		int num = sc.nextInt(); // Grabs the integer value
		
		for(int i=0; i<charArray.length;i++)
		{
			int code;
			code = (int) charArray[i]; // code is equal to the Decimal ASCII Value of each char
			
			if(code>=97 && code<=122) // Checking if code is within appropriate range
				code = code + num;
			else
			{
				for(int p=0; p<symarray.length;p++)
				{
					//System.out.println(charArray[i]);
					
					if(charArray[i] == symarray[p])
					{
						//System.out.println(symarray[p]);
						charArray[i] = encrypted[p];
						p = symarray.length;
					}
					else if(i == charArray.length-1)
						charArray[i] = '%';
				}
			}
			
			
			if(code>122)//Max value for char Decimal ASCII value, if value went passed 122, we need to revert back to 'a'
			{
				int n;
				n = code - 122;
				code = 97 + n;
			}
				
			charArray[i] = (char) code; //Casts char on the new shifted value, and inserts new char into array
			System.out.print(charArray[i]); // prints array
		}
	}
}
