
//importo la clase Scanner:
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	 // Declaro el objeto e inicializ con el objeto de entrada est�ndar.
	 // tengo en cuenta que se necesita introducir un par�metro que indique de d�nde proceder�n la fuente de datos. 
	 //En este caso uso System.in para especificar la entrada de consola de teclado est�ndar
	 		Scanner s = new Scanner(System.in);
	    //entrada de una cadena:
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    Scanner s2 = new Scanner(System.in);
	    String j2 = s2.nextLine();
	    
	    //Para comparar realmente las cadenas y no si son o no la misma instancia uso equals
	    if (j1.equals(j2)) {
	     System.out.println("Empate");
	    } else {
	      int g = 2;

	      switch(j1) {
	        case "piedra":
	     //Nuevamente comparo los valores de la string (con equals) para determinar la igualdad. El tipo de retorno es booleano.
	        	if (j2.equals("tijeras")) {
	            g = 1;
	          }
	        case "papel":
	        	if (j2.equals("piedra")) {
	            g = 1;
	          }
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	  

	    }

}
