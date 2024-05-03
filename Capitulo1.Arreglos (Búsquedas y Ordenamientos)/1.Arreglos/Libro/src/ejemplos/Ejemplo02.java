/*CONTENIDO
 * Nombre: Dayana Cayo
 * Fecha: 02/05/2024
 * Tema: Arreglos unidimensionales
 * tiempo:
 * Hacer un programa que cree un arreglo de n enteros. 
 * El n se ingresa por teclado.
 */

package ejemplos;
//scanner
import java.util.*;
//joption
import javax.swing.JOptionPane;

public class Ejemplo02 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//variable para el tamaño
		int n;
		//declarando arreglo
		int numeros[];
		//ingresar tamaño por teclado
		n=Integer.parseInt(JOptionPane.showInputDialog(null,"Tamaño del arreglo: "));
		//creando o dimensionando arreglo
		numeros = new int[n];
	}

}
