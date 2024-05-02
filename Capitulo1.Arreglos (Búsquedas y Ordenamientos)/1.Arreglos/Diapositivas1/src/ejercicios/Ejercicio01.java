/* CONTENIDO
 * Nombre: Dayana Cayo
 * Fecha: 02/05/2024
 * tiempo: 7min 49seg
 * Hacer un programa que cree un arreglo para n 
 * notas, luego que permita ingresarlas y 
 * finalmente que las imprima 
*/
package ejercicios;
import java.util.*;
public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		//declarando la variable n para el tamaño
		int n;
		//declarando arreglo notas
		int notas[];
		
		//ingresando por teclado el tamaño
		System.out.println("ingres cantidad de notas: ");
		n=input.nextInt();
		
		//creando arreglo notas
		notas=new int[n];
		
		for(int i=0;i<notas.length;i++) {
			System.out.println("Ingresar nota "+(i+1)+" :");
			notas[i]=input.nextInt();
		}
		
		for(int i=0;i<notas.length;i++) {
			System.out.println("Nota "+(i+1)+" : "+notas[i]);
		}

	}

}
/*puntos de mejora:
 * no hay validacion de la notas en rango , en si son numeros
*/
 