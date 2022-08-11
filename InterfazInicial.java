package Cartesiano;

import javax.swing.*;

	public class InterfazInicial  extends JFrame {
		
		public InterfazInicial ()
		{
			
			Rutas r=new Rutas();
			
			JScrollBar crol=new JScrollBar(); 
			Fondo f=new Fondo("Plano Cartesiano");
			setTitle("Plano cartesiano");
			
			JTextArea edi=new JTextArea();
			JScrollPane jp=new JScrollPane(edi);
		    jp.setBounds(50,70,300,150);			
  		    
		    BotonesTexto compilar=new BotonesTexto (r.obtenerRuta(0),1 ,300, 150, 50,420);
	
		    BotonesTexto avanza=new BotonesTexto (r.obtenerRuta(1),2 ,50, 50, 150,300);
		    BotonesTexto arriba=new BotonesTexto (r.obtenerRuta(2),3 ,50, 50, 150,245);
		    BotonesTexto abajo=new BotonesTexto (r.obtenerRuta(3),4 ,50, 50, 150,355);
		    BotonesTexto izquierda=new BotonesTexto (r.obtenerRuta(4),5 ,50, 50, 205,300);
		    BotonesTexto derecha=new BotonesTexto (r.obtenerRuta(5),6 ,50, 50, 95,300);
			
		    Acciona1  escucha1= new Acciona1(1,edi);
			compilar.addActionListener(escucha1);			
			
			Acciona1  escucha2= new Acciona1(2,edi);
			avanza.addActionListener(escucha2);			
			Acciona1  escucha3= new Acciona1(3,edi);
			arriba.addActionListener(escucha3);			
			Acciona1  escucha4= new Acciona1(4,edi);
			abajo.addActionListener(escucha4);			
			Acciona1  escucha5= new Acciona1(5,edi);
			izquierda.addActionListener(escucha5);
			Acciona1  escucha6= new Acciona1(6,edi);
			derecha.addActionListener(escucha6);			
							
			f.add(compilar);
			f.add(avanza);
			f.add(arriba);
			f.add(abajo);
			f.add(izquierda);
			f.add(derecha);
			
			f.add(jp);
			setContentPane(f);
			setBounds(0,0,400,600);
			setVisible(true);
			
		}		
	}

