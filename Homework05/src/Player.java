import java.awt.Point;

public class Player {
	
	private Point location;
	private int speed;
	private boolean swim;
	private boolean fly;
	
	public Player(Point location, int spaces, boolean swimming, boolean flying)
	{
		this.location = location;
		speed = spaces;
		swim = swimming;
		fly = flying;
	}
	
	public char[][] move (char[][] map)
	{
		int playerX = (int) location.getX();
		int playerY = (int) location.getY();
		map[playerX][playerY] = 'P';
		int xlength = (int) map.length -1;
		int ylength = (int) map[0].length-1;
		
		
		checkY(map, xlength, ylength, playerX, playerY, speed);
		return map;
	}
	
	
	
	private char[][] checkX(char [][] map, int xlength, int ylength, int playx, int playy, int speed)
	{
		int x = xlength;
		int y = ylength;
		int xlocation = playx;
		int ylocation = playy;
		double distance; //finds distance
		int spaces = speed;
			if(x>=0)
			{
				//Call methods to check flying mountain and such
				distance = Math.sqrt((xlocation-x)*(xlocation-x) + (ylocation-y)*(ylocation-y));
				if(distance <= spaces)
				{
					map[x][y] = Character.toUpperCase(map[x][y]);
					
				}
				System.out.println(map[x][y]);
				x--;
				checkX(map, x, y, xlocation, ylocation, speed);
			}
			
			return map;
	}
	
	private void checkWater()
	{
		
		
	}
	
	private void checkMountain
	
	private void checkY(char [][] map, int xlength, int ylength, int playx, int playy, int speed)
	{
		int x = xlength;
		int y = ylength;
		
		if(y>0)
		{
			checkX(map, x, y, playx, playy, speed);
			y--;
			checkY(map, x, y, playx, playy, speed);
		}
	}
	
	
	public void displayMap(char [][] map)
	{
		for(int i=0; i<map.length; i++)
		{
			System.out.println();
			for(int x=0; x<map[0].length; x++)
			{
				System.out.print(map[i][x]);
			}
		}
	}
}
