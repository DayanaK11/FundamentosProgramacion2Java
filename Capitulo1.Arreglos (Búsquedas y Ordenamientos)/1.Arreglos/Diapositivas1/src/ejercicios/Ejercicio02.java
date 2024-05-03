/* CONTENIDO
 * Nombre: Dayana Cayo
 * Fecha: 02/05/2024
 * tiempo: 10min 49 seg
 * 
 * Hacer un programa que cree un arreglo con 
 * capacidad para 100 números de celulares (que 
 * sólo acepte números de 9 dígitos), que permita 
 * ingresar los números requeridos hasta que el 
 * usuario ingrese una “q” y finalmente que 
 * imprima sólo los números ingresados. Confiar 
 * que el usuario siempre ingresa dígitos. 
 * 
 * */

package ejercicios;
import java.util.*;
public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int tamaño=100;	
		int contador=0;
		String numero;
		String contactos []=new String[tamaño];
		
		System.out.println("Ingresar numero: ");
		numero=input.next();
		
		while(!(numero.equalsIgnoreCase("q"))&&(contactos.length<100)) {
			if(numero.length()==9) {
				contactos[contador]=numero;
				contador++;
			}
			else
				System.out.println("Ingrese un numero de 9 digitos");
			System.out.println("Ingresar numero ('q' para salir): ");
			numero=input.next();
		}
		//imprimit
		for(int i=0;i<contador;i++) {
			System.out.println("Numero "+(i+1)+" : "+contactos[i]);
		}
	}
}
