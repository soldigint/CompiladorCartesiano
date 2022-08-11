package Cartesiano;

import javax.swing.*;

public class BotonesTexto  extends JButton{
	static private int ide;
	static private ImageIcon icon1;
	
	BotonesTexto(String ruta,int id , int x, int y, int lx, int ly){
       icon1 = new ImageIcon(ruta);	
		
		setIcon(icon1);	
		setLocation(lx,ly);
		setSize(x,y);		
		ide=id;
		
	}
}
