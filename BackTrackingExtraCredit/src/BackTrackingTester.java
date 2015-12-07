import java.awt.*;
import java.awt.event.*;

public class BackTrackingTester extends Frame implements ActionListener {
	
	String [] description = 
	{"This application sets a player down in the middle of a map,",
	"and depending on the number of spaces and moves and terrain", 
	"all of the viable moves in which the player can make will then be capitalized."};
	
	Map m1 = new Map(); // Created a Map
	Player p1 = new Player(5, 8, 4, 3, false, false); // Instantiated a Player
	
	String command = ""; // Initialized command

	public static void main(String[] args) {
		
		Frame frame = new BackTrackingTester();
		
		frame.setResizable(false);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
	
	public BackTrackingTester()
	{
		setTitle("Back Tracking Extra Credit");
		
		//Create Menu Bar
		MenuBar mb = new MenuBar();
		setMenuBar(mb);
		
		//Create menu group labeled file
		Menu fileMenu = new Menu("File");
		
		//add it to the menu bar
		mb.add(fileMenu);
		
		//Create Menu Bar
		// add action listener
		// add to "File" menu bar
		
		MenuItem miAbout = new MenuItem("About");
		miAbout.addActionListener(this);
		fileMenu.add(miAbout);
		
		MenuItem miExit = new MenuItem("Exit");
		miExit.addActionListener(this);
		fileMenu.add(miExit);
		
		//Create Menu group labeled "Map"
		Menu mapMenu = new Menu("Map");
		
		//add it to menu bar
		mb.add(mapMenu);
		
		//Create menu items
		//add action listener
		//add to "Map" menu group
		
		MenuItem miShowMap = new MenuItem("Show Map");
		miShowMap.addActionListener(this);
		mapMenu.add(miShowMap);
		
		MenuItem miShowMoves = new MenuItem("Show Moves");
		miShowMoves.addActionListener(this);
		mapMenu.add(miShowMoves);
		
		
		WindowListener l = new WindowAdapter()
		{
			public void windowClosing(WindowEvent ev)
			{
				System.exit(0);
			}
			public void windowActivated(WindowEvent ev)
			{
				repaint();
			}
			public void windowStateChanged(WindowEvent ev)
			{
				repaint();
			}
		};
		
		ComponentListener k = new ComponentAdapter()
		{
			public void ComponentResized(ComponentEvent e)
			{
				repaint();
			}
		};
		
		//Register Listeners
		this.addWindowListener(l);
		this.addComponentListener(k);
	}
	
	public void actionPerformed(ActionEvent ev)
	{
		//figure which command was issued
		command = ev.getActionCommand();
		
		//take action accordingly
		if("About".equals(command))
		{
			repaint();
		}
		else if("Exit".equals(command))
		{
			System.exit(0);
		}
		else if("Show Map".equals(command))
		{
			p1.setPosition(p1.posX, p1.posY);
			m1.unshade();
			repaint();
		}
		else if("Show Moves".equals(command))
		{
			p1.showMoves(p1.posX, p1.posY);
			repaint();
		}
	}
	
	public void paint (Graphics g)
	{
		int x = 250;
		int y = 200;
		
		int ww = (int)this.getWidth();
		int wh = (int)this.getHeight()-50;
		
		if("About".equals(command))
		{
			for(int l=0; l<description.length;l++)
			{
				g.drawString(description[l], x-200, y);
				y = y +10;
			}
		}
		else if("Show Map".equals(command))
		{
			for (int i = 0; i < m1.width; i++)
			{
				for (int j = 0; j < m1.length; j++)
				{
					String c = Character.toString(m1.map[i][j]);
					g.drawString(c, x-50, y);
					x = x + 10;
				}
				y = y + 10;
				x = x - (m1.length*10);
			}
		}
		else if("Show Moves".equals(command))
		{
			for (int i = 0; i < m1.width; i++)
			{
				for (int j = 0; j < m1.length; j++)
				{
					String c = Character.toString(m1.map[i][j]);
					g.drawString(c, x-50, y);
					x = x + 10; 
				}
				y = y + 10; 
				x = x - (m1.length*10);
			}
		}
		else
		{
				g.drawString("Author: Craig Bodden", x-75, y);
				y = y +10;
				g.drawString("Date Created: 12/14/2014", x-75, y);
				y = y +10;
				g.drawString("Title: Back tracking Extra Credit", x-75, y);
		}
	}
}