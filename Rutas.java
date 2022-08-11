package Cartesiano;

public class Rutas {
	String [] ruta={
	"/Users/laura/Documents/workspace/Compilador/src/Cartesiano/tortuga.png",
	"/Users/laura/Documents/workspace/Compilador/src/botones/avanza.png",
	"/Users/laura/Documents/workspace/Compilador/src/botones/arriba.png",
	"/Users/laura/Documents/workspace/Compilador/src/botones/abajo.png",
	"/Users/laura/Documents/workspace/Compilador/src/botones/izquierda.png",
	"/Users/laura/Documents/workspace/Compilador/src/botones/derecha.png"
					        
	};
	
	Rutas()
	{  }
	
	String obtenerRuta(int n)
	{
		
		return ruta[n];
	}
	}
