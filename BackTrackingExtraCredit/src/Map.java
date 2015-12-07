
public class Map {
	
	static char [][] map = {{'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g'},
        {'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g'},
        {'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g'},
        {'g', 'g', 'g', 'g', 'w', 'g', 'g', 'g', 'g', 'g', 'g', 'g'},
        {'g', 'g', 'g', 'g', 'g', 'm', 'g', 'x', 'g', 'g', 'g', 'g'},
        {'g', 'g', 'g', 'g', 'x', 'g', 'g', 'g', 'g', 'g', 'g', 'g'},
        {'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g'},
        {'g', 'g', 'g', 'm', 'm', 'x', 'g', 'g', 'g', 'g', 'g', 'g'},
        {'g', 'g', 'g', 'g', 'g', 'g', 'x', 'x', 'g', 'g', 'g', 'g'},
        {'g', 'g', 'g', 'g', 'g', 'g', 'x', 'g', 'g', 'g', 'g', 'g'},
        {'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g'},
        {'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g'}};
	
	static int width = map[0].length;
	static int length = map.length;
	
	public static void shade(int x, int y)
	{
		map[x][y] = Character.toUpperCase(map[x][y]);
	}
	
	public static void unshade()
	{
		for(int i=0; i<width; i++)
		{
			for(int j=0; j<length; j++)
			{
				map[i][j] = Character.toLowerCase(map[i][j]);
			}
		}
	}
}