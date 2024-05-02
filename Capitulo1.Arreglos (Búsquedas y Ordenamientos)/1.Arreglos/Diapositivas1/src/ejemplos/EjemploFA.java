/*CONTENIDO
 * Nombre: Dayana Cayo
 * Fecha: 02/05/2024
 * declaracion y creacion de un arreglo
 * ingreso de datos a un arreglo
 * impresion de datos de un arreglo
 */

package ejemplos;
//importando La clase Scanner para ingresar datos por teclado
import java.util.Scanner;

public class EjemploFA {

	public static void main(String[] args) {
		//inicializando y creando un arreglo
		String nombres [] = new String [4];
		
		//scanner
		Scanner input=new Scanner(System.in);
		
		//ingresar datos al arreglo nombres
		for(int i=0;i<nombres.length;i++) {
			System.out.println("Ingresar nombre "+(i+1)+" :");
			//usando scanenr
			nombres[i]=input.next();
		}
		
		//imprimir datos del arreglo
		for(int i=0;i<nombres.length;i++) {
			System.out.println("Nombre "+(i+1)+" : "+nombres[i]);
		}

	}

}
