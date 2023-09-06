package gui.tools;

import java.awt.Graphics;

public class Punto extends DrawTool {

	public Punto(int x,int y) {
		setPoints(x,y);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawLine(getX1(), getY1(),getX1(), getY1());
		g.drawLine(getX1(), getY1(),getX1()+1, getY1()+1);
		g.drawLine(getX1(), getY1(),getX1(), getY1()+1);
		g.drawLine(getX1(), getY1(),getX1()+1, getY1());
	}
}
