package Cartesiano;

import javax.swing.*;
import java.awt.*;

public class Fondo  extends JPanel{
	static private JLabel pie;
	 static private ImageIcon icon1;
	Fondo( String titulo)
	{
		setLayout(null);
       
      Font fuente= new Font("",Font.BOLD,36);
        
        pie = new JLabel(titulo);
        pie.setLocation(40,10);
        pie.setSize(900,40);
        pie.setForeground(new Color(0,0,255));
        pie.setFont(fuente);      
        add(pie);	
	}
	


}
