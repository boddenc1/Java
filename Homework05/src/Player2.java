import java.awt.Point;


public class Player2 {
	private Point location;
	private int speed;
	private boolean swim;
	private boolean fly;
	
	public Player2(Point location, int spaces, boolean swimming, boolean flying)
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
		
		
		checkNorth(map, ylength);
		checkSouth();
		
		return map;
	}
	
	private void checkNorth(char [][]map, int ylength )
	{
		int x = (int) location.getX();
		int y = (int) location.getY();
		int gety = ylength - y;
		if(int gety>)
		{
			//Check each attribute on each move
		}
		//hold player position
		//Check up from player position
		//hold last position
	}
	
	private void checkSouth()
	{
		//hold player position
		//Check up from player position
		//hold last position
	}
	
	private void checkEast()
	{
		//hold player position
		//Check up from player position
		//hold last position
	}
	
	private void checkWest()
	{
		//hold player position
		//Check up from player position
		//hold last position
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
