/*CONTENIDO
 * Nombre: Dayana Cayo
 * Fecha: 02/05/2024
 * Tema: Arreglos unidimensionales
 * tiempo:4min 16seg
 * Encontrar el mínimo valor de 10 números enteros
 * usando un arreglo.
 */
package ejemplos;
public class Ejemplo01 {

	public static void main(String[] args) {
		//lista inicializadora con 10 numeros
		int numeros[]= {8,45,12,7,9,4,25,6,47,51};
		int minimo;
		minimo=numeros[0];
		//bucle para encontrar el minimo
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]<minimo)
				minimo=numeros[i];
		}
		//imprimit
		System.out.println(minimo);
	}
}
