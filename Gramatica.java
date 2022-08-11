package Cartesiano;

public class Gramatica {

	String [] vocabulario={"posiciona;", "avanza;", "izquierda;", "derecha;", "arriba;","abajo;","fin;"};
	String [] sintaxis={"1 2"};
		Gramatica()
	{
			
	}
	
		String [] getVocabulario()
		{
			return vocabulario;
		}

		String [] getSintaxis()
		{
			return sintaxis;
		}
		
		
}
