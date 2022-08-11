package Cartesiano;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.*;

public class Acciona1 implements ActionListener {
	int nv;
	JTextArea codigo;	
	Acciona1( int d, JTextArea a)
	{
		nv=d;
		codigo=a;
	}
    public void actionPerformed(ActionEvent e) { 
   
    	switch (nv)
    {
    	case 1:
    	{

    		File fil;
			fil= new File("/Users/laura/Desktop/hola.txt");
			  try
			     { 
			        FileWriter write = new FileWriter(fil);
			        BufferedWriter bw = new     		
					BufferedWriter( write );
			        PrintWriter wr= new PrintWriter(bw);
    		        String archivo =codigo.getText();
    	    	    wr.append(archivo);	
    	    	    wr.close();
		             bw.close(); 
		                 }catch( Exception ex ){  }
    		
    		Lexico analizador=new Lexico("/Users/laura/Desktop/hola.txt");
    		
    		analizador.analizadorLexico();
    		
            Semantico generador=new Semantico("/Users/laura/Desktop/hola.txt");
    		
    		generador.generarSalida();
    		
    		break;
    	}
    	case 2:
    	{
    		codigo.append("avanza;"+"\n");
    		
        break;
        }
    	case 3:
    	{
    		codigo.append("arriba;"+"\n");
    		
    		 break;
    	}
    	case 4:
    	{
    		codigo.append("abajo;"+"\n");
   		 
   		 break;
   	}
    	case 5:
    	{
    		codigo.append("izquierda;"+"\n");
    		
    		break;
      	}
    	case 6:
    	{
    		codigo.append("derecha;"+"\n");
    		
    		break;
      	}
    	
    	default:
    		break;
    	
    }
	        }
}

