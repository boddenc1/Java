
	public class HashingTable 
	{
		private Node head;
		Node [] strArray = new Node [10];  //An Array of Strings "Table"
		byte [] bin = null;
		String num;
		int fullCount = 0;
		int count;
		int position;
		
		public void HashingTable()
		{
			head = null;
		}
		
		
		public void add(String str)
		{
			Node curr;
			fullCount = 0;
			bin = str.getBytes(); // breaks the string into bytes
			for(byte b : bin)
			{
				num = Integer.toBinaryString(b); // converts the bytes into binary String per letter.
				count = Integer.parseInt(num, 2); // Converts from binary to int
				fullCount = fullCount + count; // counter to keep track of overall amount
			}
			position = (fullCount%strArray.length); // the position of the value is determined by the full count mod the array length
			
			if(strArray[position] == null)//Checks if that position is not being used
			{
				curr = head;
				Node newNode = new Node(str);
				
				//strArray[position] = str;
			}
			else if(strArray[position]!= null)//If position is already being used, iterate through till the end of the list till empty position is found
			{
				Node newNode = new Node(str);
				curr = head;
				for(curr : curr != null)
				{
					if(curr == null)
					{
						curr.next = newNode;
						newNode.next = null;
					}
				}
			}
			else // if no empty position is found, start from the beginning of the table and iterate till original position.
			{
				for(int d=0; d<strArray.length-position;)
				{
					if(strArray[d]!= null)
					{
						d++;
					}
					else if(strArray[d] == null)
					{
						strArray[d] = str;
					}
					else // If no position is found, there are no spaces left.
						System.out.println("Sorry there are no free spaces in the table");
				}
			}
		}
		
		public void retrieve(String strret) // Method retrieves where the string is in the Hashing table
		{
			boolean bool = false;
			int n1;
			bin = strret.getBytes(); // First breaks up the String into bytes
			fullCount = 0;
			
			for(byte b : bin)
			{
				num = Integer.toBinaryString(b); //Converts each byte into BinaryString per letter
				count = Integer.parseInt(num, 2); // Converts the binary String into int.
				fullCount = fullCount + count; // holds a running counter of all int values of letters
			}
			position = (fullCount%strArray.length);// The assumed position is chosen by the same algorithm as is if were being added
			
			if(strret.equals(strArray[position]))// If the retrieved string is the same as the string in the proposed position, print it.
			{
				System.out.println(strret + " is stored in position " + position);
			}
			else if(!strret.equals(strArray[position]))// if the position is not right, due to a collision 
			{
				for(int k=position; k<strArray.length;k++) // iterate through the rest of the table
				{
					
					if(strret.equals(strArray[k])) // if we find the string then print it
					{
						System.out.println(strret + " is stored in position " + k);
						bool = true; // change bools value 
					}
				}
				if(bool != true) // If we have still not found it, iterate through from the beginning of the list to the original position, then print it if found.
				{	
					for(int m=0; m<position; m++)
					{
						if(strret.equals(strArray[m]))
						{
							System.out.println(strret + " is stored in position " + m);
							bool = true;
						}
					}
					if(bool != true) // Finaly if we cannot find the string in the table, we print out message.
					{
						System.out.println("I am sorry the string " + strret + " you have requested is not currently in the table or we cannot find it.");
					}
				}
			}
		}
		
		/*
		 * test method.
		public void print()
		{
			for(int i=0; i<strArray.length; i++)
			{
				System.out.println("Element " + i + " holds the value of " + strArray[i]);
			}
		}
		*/
	}
