//importo la clase Scanner:
import java.util.Scanner;
public class Ejercicio5 {
	//agrego el método principal de Java con modificador de acceso del método principal público
	public static void main(String[] args) {

	 
	//En este caso uso System.in para especificar la entrada de consola de teclado estándar
	Scanner s = new Scanner(System.in);
	System.out.print("Introduzca un número: ");
	//Defino nextInt para leer datos del tipo entero y cambio el String a int
	int c = s.nextInt();
    
    int afo = 0;
    int noAfo = 0;
    //corrijo int c = ni a  int ni=c;
    int ni=c;
    
    while (ni > 0) {
	  int digito = (int)(ni % 10);
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afo++;
      } else {
		noAfo++;
    }
      // pongo -=, un operador de asignación compuesta  para restarle la cantidad 'digito' al valor de mi variable 'ni' 
      //hasta llegar a 0 y aplicar la condición
      
      ni-=digito; 
      ni/=10; //da ni que contiene todos los dígitos excepto el último. 
    } //agrego corchete

    if (afo > noAfo) {
    	//corrijo printn a println
      System.out.println("El " + c + " es un número afortunado.");
    } else {
      System.out.println("El " + c + " no es un número afortunado.");
    }
    
  }
	}
//Los números "afortunados" de Euler son enteros positivos n que cumplen la condición de que para todos los enteros k tales que 1 ≤ k < n, 
//el polinomio k^2 − k + n produce un número primo. 
//Los números primos son aquellos que solo son divisibles entre ellos mismos y el 1.
//CONCLUYENDO: este código nos ayuda a confirmar si algún número es afortunado (es primo) o no es afortunado (es compuesto)
