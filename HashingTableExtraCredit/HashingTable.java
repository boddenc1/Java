
	public class HashingTable 
	{
		String [] strArray = new String [10];
		byte [] bin = null;
		String num;
		int fullCount = 0;
		int count;
		int position;
		
		public void size()
		{
			System.out.println(strArray.length);
		}
		
		public void add(String str)
		{
			fullCount =1;
			bin = str.getBytes();
			for(byte b : bin)
			{
				num = Integer.toBinaryString(b);
				count = Integer.parseInt(num, 2);
				fullCount = fullCount + count;
			}
			fullCount = fullCount -1;
			
			position = (fullCount%strArray.length);
			//System.out.println(position);
			
			if(strArray[position] == null)
			{
				strArray[position] = str;
			}
			else if(strArray[position]!= null)
			{
				for(int p=position; p<strArray.length;)
				{
					if(strArray[p] != null)
					{
						p++;
					}
					else
					{
						strArray[p] = str;
						return;
					}
					
				}
			}
			else
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
					else
						System.out.println("Rawr");
				}
			}
			
			
		}
		
		public void retrieve(String strret)
		{
			boolean bool = false;
			int n1;
			bin = strret.getBytes();
			fullCount =1;
			
			for(byte b : bin)
			{
				num = Integer.toBinaryString(b);
				count = Integer.parseInt(num, 2);
				fullCount = fullCount + count;
			}
			fullCount = fullCount -1;
			
			position = (fullCount%strArray.length);
			System.out.println(position);
			if(strret.equals(strArray[position]))
			{
				System.out.println("Its stored in position " + position);
				return;
			}
			
			else if(!strret.equals(strArray[position]))
			{
				for(int k=position; k<strArray.length;k++)
				{
					if(strret.equals(strArray[k]))
					{
						System.out.println("Its stored in position " + k);
						bool = true;
						return;
					}
				}
			}
			else if(bool == false)
			{
				n1 = strArray.length - position;
				
				for(int i=0; i<n1; i++)
				{
					if(strret.equals(strArray[i]))
					{
						System.out.println("Its stored in position " + position);
						bool = true;
						return;
					}
				}
			}
			else
				System.out.println("I am sorry the string you have requested is not currently in the table or we cannot find it.");
		}
		
		
		public void print()
		{
			for(int i=0; i<strArray.length; i++)
			{
				System.out.println("Element " + i + " holds the value of " + strArray[i]);
			}
		}
		
	}

}
