package gui;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Dibujo1 extends JPanel {
	static int contador=0;
	int x1,x2,y1,y2;
	
	public void Dibujo1() {
		
		contador++;
	}

	@Override
    public void paintComponent(Graphics g) {
        
       
        // Realiza aquí tus operaciones de dibujo
        
        g.drawLine(x1, y1, x2, y2);
    }
    public void limpiarDibujo() {
    	
    }
    
    
    
    
    public void generarLinea(int x1,int y1,int x2,int y2) {
    	this.x1=x1;
    	this.x2=x2;
    	this.y1=y1;
    	this.y2=y2;
    	 //Redibujar el JPanel para mostrar las líneas actualizadas
    	limpiarDibujo();
    	//a.clearRect(1, 1, 100, 100);
    }
    
    
    
}