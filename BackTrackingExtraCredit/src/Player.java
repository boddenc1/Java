
public class Player {
	
	int posX, posY;
	int speed;
	int stamina;
	
	int moves;
	boolean swim;
	boolean fly;
	char ground = 'g';
	
	public Player (int x, int y, int speed, int moves, boolean swim, boolean fly)
	{
		posX = x;
		posY = y;
		this.speed = speed;
		stamina = speed +1;
		this. moves = moves;
		this.swim = swim;
		this.fly = fly;
	}
	
	public boolean setPosition(int x, int y)
	{
		if(x <0 || y<0 || x > Map.width || y>Map.length)
		{
			posX = x;
			posY = y;
			return true;
		}
		else
			return false;
	}
	
	
	public boolean showMoves(int x, int y)
	{
		stamina--;
        if (x < 0 || y < 0 || x > Map.width - 1 || y > Map.length - 1)
        {
            stamina++;
            return false;
        }
        if (Map.map[y][x] == 'x')
        {
            stamina++;
            return false;
        }
        if (Map.map[y][x] == 'w' && !(swim || fly))
        {
            stamina++;
            return false;
        }
        if (Map.map[y][x] == 'm' && !fly)
        {
            stamina++;
            return false;
        }
        
        Map.shade(y, x);

        if (stamina > 0 && showMoves(y - 1, x)) // North
        {
            move("up");
            return true;
        }
        if (stamina > 0 && showMoves(y, x + 1)) // East
        {
            move("right");
            return true;
        }
        if (stamina > 0 && showMoves(y + 1, x)) // South
        {
            move("down");
            return true;
        }
        if (stamina > 0 && showMoves(y, x - 1)) // West
        {
            move("left");
            return true;
        }
        stamina++;
        return false;
    }
	
	 public void move(String direction)
	    {
	        Map.map[posX][posY] = ground;
	        if (direction.equals("up"))  // North
	        {
	            posX--;
	        }
	        if (direction.equals("left"))  // West
	        {
	            posY--;
	        }
	        if (direction.equals("right"))  // East
	        {
	            posY++;
	        }
	        if (direction.equals("down"))  // South
	        {
	            posX++;
	        }
	        ground = Map.map[posX][posY];
	        Map.map[posX][posY] = 'p';
	    }
	 
	 public boolean move(int x, int y)
	    {
	        if (Character.isUpperCase(Map.map[x][y]))
	        {
	            Map.map[posX][posY] = ground;
	            ground = Map.map[x][y];
	            setPosition(x, y);
	            Map.map[x][y] = 'p';
	            moves--;
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	    }
}