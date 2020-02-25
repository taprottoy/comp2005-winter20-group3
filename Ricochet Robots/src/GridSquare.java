import java.awt.Color;
import javax.swing.*;

public class GridSquare extends JPanel {
	
	private int xcoord, ycoord;			
	
	public GridSquare( int xcoord, int ycoord)
	{
		super();
//		this.setSize(50,50);
		this.setXcoord(xcoord);
		this.setYcoord(ycoord);
		
	}
	
	public void setColor( int xfor, int yfor)
	{	
		Color colour; 
		boolean column = (xfor==7 | xfor==8)?true:false;
		boolean row = (yfor==7 | yfor==8)?true:false;
		colour = (column==true & row==true )?Color.DARK_GRAY:Color.lightGray;

		this.setBackground( colour );
	} 

	public int getXcoord() {
		return xcoord;
	}

	public void setXcoord(int xcoord) {
		this.xcoord = xcoord;
	}

	public int getYcoord() {
		return ycoord;
	}

	public void setYcoord(int ycoord) {
		this.ycoord = ycoord;
	}
}