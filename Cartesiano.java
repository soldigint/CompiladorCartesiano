package Cartesiano;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Cartesiano extends JPanel {
   Graphics grafico;
   Lista codigoFuente;
   
   Cartesiano(Lista li)
   {
	   codigoFuente=li;
	   
   }
   
 	
	public void paintComponent(Graphics g) {
  	  super.paintComponent(g);
  	    	  
  	  g.setColor(new Color(0,0,250)); //linea Azul
  	  g.drawLine(350,0,350,700);      //eje y
  	  g.drawLine(0,350,700,350);      //eje x
  	  g.fillOval(335,335,25, 25);
  	  Font f=new Font("",Font.BOLD,34);
  	  g.setFont(f);
 	  g.drawString("-x", 20, 340);		
 	  g.drawString("+x", 650, 340);		 
 	  g.drawString("+y", 360, 40);	 
	  g.drawString("-y", 360, 550);	
	 
			if(codigoFuente.nodoinicial!=null)
		{
	 		Nodo auxiliar;
	 		int direccion=1;
	 		int centrox=340,centroy=340,x1=centrox,y1=centroy;
	 		
			auxiliar=codigoFuente.nodoinicial;
			while(auxiliar.siguiente != null)
			{
				
				int valor=0;
				if ((auxiliar.dato.compareTo("posiciona;"))==0)
				{ 
					valor=1; 
					x1=centrox;
				    y1=centroy; 
				   	}
				else 
				{
					if ((auxiliar.dato.compareTo("arriba;"))==0)
					{ 
						valor=2;  
						direccion=3;
						}
				 	else
				   {
					if ((auxiliar.dato.compareTo("abajo;"))==0)
					{
						valor=3; 
						direccion=4;
						}
				
				else 
					{
						if ((auxiliar.dato.compareTo("izquierda;"))==0)
					{ 
						valor=4;
						direccion=1;
						}
						else
					{
					
					if ((auxiliar.dato.compareTo("derecha;"))==0)
					{
						valor=5;
						direccion=2;
						}
				
				else
					{
					if ((auxiliar.dato.compareTo("avanza;"))==0)
				 {
					valor=6;
					
						switch (direccion)
						{
							case  1:
							    g.fillRect(x1+20, y1, 20,20);
								x1=x1+20;
								break;
							case  2:
							    g.fillRect(x1-20, y1, 20,20);
								x1=x1-20;
								break;
								
							case  3:
							    g.fillRect(x1, y1-20, 20,20);
								y1=y1-20;
								break;
							case  4:
							    g.fillRect(x1, y1+20, 20,20);
								y1=y1+20;
								break;
								
							default:
								break;
						}	}
					     }
					  }
					  }
					}
						}
				auxiliar=auxiliar.siguiente;
				
		 }		
  	 }
	}
}
