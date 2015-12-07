import java.awt.Point;
import java.util.Random;

public class JourneyTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rn = new Random ();
		int x;
		
		char[][] startMap = new char[10][10];
		
		for(int i=0; i<startMap.length; i++)
		{
			for(int j=0; j<startMap[0].length; j++)
			{
				x = rn.nextInt(3);
				if(x==0)
					startMap[i][j] = 'g';
				else if(x==1)
					startMap[i][j] = 'm';
				else if(x==2)
					startMap[i][j] = 'w';
				else
					startMap[i][j] = 'x';
			}
		}
			//{{'w','g','g','x'},{'w','g','g','x'},{'w','g','g','x'},{'w','g','g','x'},{'w','g','g','x'},{'w','g','g','x'}};
		
		Player2 p = new Player2(new Point(2,3), 3, false, false);
		
		
		
		char[][] map = p.move(startMap);
		p.displayMap(startMap);

	}

}
