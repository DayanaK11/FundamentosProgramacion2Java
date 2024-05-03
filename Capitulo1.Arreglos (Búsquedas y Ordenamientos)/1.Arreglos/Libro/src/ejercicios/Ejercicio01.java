/*CONTENIDO
 * Nombre: Dayana Cayo
 * Fecha: 02/05/2024
 * tiempo: 5min 11seg
 * Tema: Arreglos unidimensionales
 * Hacer un programa que cree un arreglo para n notas (el n se ingresa en tiempo de 
 * ejecución),	luego	que	permita	ingresarlas	y	finalmente	que	las	imprima.
 */

package ejercicios;
import java.util.*;
public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//declarar arreglo
		double notas[];
		//declarar variable tamaño
		int tamanio;
		//ingresar por teclado el tamaño
		System.out.println("Ingresar cantidad de notas: ");
		tamanio=input.nextInt();
		//crear arreglo 
		notas=new double[tamanio];
		
		//ingresar notas
		for(int i=0;i<notas.length;i++) {
			System.out.println("Ingresar nota "+(i+1)+" : ");
			notas[i]=input.nextDouble();
		}
		
		//imprimir
		System.out.println("NOTAS");
		for(int i=0;i<notas.length;i++) {
			System.out.println("Nota "+(i+1)+" : "+notas[i]);
		}
			
	}

}
