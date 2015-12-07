
public class HashingTester {

	public static void main(String[] args) {
		
		HashingTable ht = new HashingTable();
		
		ht.add("poop");
		ht.add("merp");
		ht.add("loo");
		ht.add("grrrrr");
		
		ht.retrieve("poop");
		ht.retrieve("woof");
	}

}