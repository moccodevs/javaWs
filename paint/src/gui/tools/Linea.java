package gui.tools;

import java.awt.Graphics;

public class Linea extends DrawTool {
	
	public Linea(int x1,int y1,int x2,int y2) {
		setPoints(x1,x2,y1,y2);
		System.out.println("se movio el maus");
	}
	@Override
	public void paintComponent(Graphics g) {
		g.drawLine(getX1(), getY1(),getX2(), getY2());
		g.setColor(getBackground());
	}
	
	public void setPoint1(int x1,int y1) {
		setX1(x1);
		setY1(y1);
	}
	
	public void setPoint2(int x2,int y2) {
		setX2(x2);
		setY2(y2);
	}
}
