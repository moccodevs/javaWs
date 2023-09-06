package gui;

import java.awt.event.MouseListener;
import javax.swing.JFrame;
import gui.tools.Linea;
import gui.tools.Punto;
import java.awt.Point;
import java.awt.dnd.MouseDragGestureRecognizer;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.SpringLayout;
import java.awt.CardLayout;

public class Window extends JFrame{
	static int x1=0;
	static int y1=0;
	static int x2=0;
	static int y2=0;
	
	public Window(){
		
		initWindow();
		initInputListeners();
	}

	//public void pintarLinea(int x1,int y1,int x2,int y2) {
	//	Linea linea=new Linea(x1, y1, x2, y2);
	//	getContentPane().add(linea);
	//	setVisible(true);
	//}
	

	
	public void initWindow() {
		setAlwaysOnTop(true);
		setSize(1200, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		initComponents();

	}
	
	
	public void initComponents() {
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		toolBar.setRollover(true);
		toolBar.setAlignmentX(Component.LEFT_ALIGNMENT);
		toolBar.setBackground(new Color(192, 192, 192));
		toolBar.setToolTipText("");
		
		JToggleButton botonPunto = new JToggleButton("    .    ");
		JToggleButton botonLinea = new JToggleButton("    /    ");
		
		/*******************Boton Punto*************************/
		
		botonPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					selectPunto(botonPunto.isSelected());
			}
		});
		getContentPane().setLayout(new BorderLayout(0, 0));
		botonPunto.setSelected(true);
		toolBar.add(botonPunto);
		/*******************Boton Linea*************************/
		botonLinea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					selectLinea(botonLinea.isSelected());
			}
				
		});
		botonLinea.setEnabled(true);
		botonLinea.setSelected(true);
		
		/*******************************************************/
		toolBar.add(botonLinea);
		getContentPane().add(toolBar, BorderLayout.NORTH);
		
	}
	public int getMouseX() {
			
		return getMousePosition().x-8;
	}
	public int getMouseY() {
		
		return getMousePosition().y-63;
	}
	
	public void pintarLinea(int x1,int y1,int x2,int y2) {
		Linea linea=new Linea(x1, y1, x2, y2);
		getContentPane().add(linea);
		setVisible(true);
		
	}

	public void pintarPunto(int x, int y) {
		Punto punto= new Punto(x,y);
		getContentPane().add(punto);
		setVisible(true);
	}
	
	public void selectLinea(boolean buttonSelected) {
		if (buttonSelected) {
			addMouseListener(new MouseAdapter() {
				Linea l = new Linea(x1,y2,x2,y2);
				/*
				@Override
				public void mouseDragged(MouseEvent e){
					x1=getMousePosition().x;
					y1=getMousePosition().y;
					System.out.println("clickeaste el mouse");
				}
				*/
				@Override
				public void mousePressed(MouseEvent e){
					l.setPoint1(getMouseX(),getMouseY());
					System.out.println("presionaste el maus xd x="+getMouseX()+"; y="+getMouseY());
				}
				@Override
				public void mouseReleased(MouseEvent e){
					pintarLinea(l.getX1(),l.getY1(),getMouseX(),getMouseY());
			        System.out.println("soltaste el mouse x="+getMouseX() +"; y="+getMouseY());
			    }
			});
		}
	}
	
	public void selectPunto(boolean buttonSelected) {
			addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseDragged(MouseEvent e){
					if (buttonSelected) {
						pintarPunto(getMouseX(),getMouseY());
						System.out.println("presionaste el maus xd x="+getMouseX()+"; y="+getMouseY());
					}
				}
			});

	}
	
	public void initInputListeners() {
		
		
		/*
		addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				pintarPunto(getMousePosition().x,getMousePosition().y);
				System.out.println("presionaste una tecla xd");
				
			}
		});
		*/
		/*
		addMouseListener(new MouseAdapter() {
			Linea l = new Linea(x1,y2,x2,y2);
			
			@Override
			public void mouseDragged(MouseEvent e){
				x1=getMousePosition().x;
				y1=getMousePosition().y;
				System.out.println("clickeaste el mouse");
			}
			
			@Override
			public void mousePressed(MouseEvent e){
				l.setPoint1(getMousePosition().x,getMousePosition().y);
				System.out.println("presionaste el maus xd x="+getMousePosition().x+"; y="+getMousePosition().y);
			}
			@Override
			public void mouseReleased(MouseEvent e){
				pintarLinea(l.getX1(),l.getY1(),getMousePosition().x,getMousePosition().y);
		        System.out.println("soltaste el mouse x="+getMousePosition().x +"; y="+getMousePosition().y);
		    }	        
			
		});*/
	}
}
