package Cartesiano;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
public class Semantico {
JFrame ventana;
Lista codigoFuente;
	
	Semantico(String ruta){
		
		Lista salida=new Lista();
		 try
	       {   
	        Archivos fuente=new Archivos();
	   	   salida=fuente.abrirArchivo(ruta); 
	  	    }catch( Exception ex )
	       {  
	       System.out.println(ex);
	       }			 
		 codigoFuente=salida;
	}

	void generarSalida()
	{
		
		Cartesiano plano=new Cartesiano(codigoFuente);
		ventana= new JFrame(" Plano cartesiano ");		
		ventana.setSize(700,700);
		ventana.setLocation(410,10);
		ventana.setVisible(true);
		ventana.add(plano);	
	}
}
