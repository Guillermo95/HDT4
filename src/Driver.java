/*Universidad del Valle de Guatemala
 *Algoritmos y Estructuras de Datos
 *Secci�n 30
 *Guillermo Javier de Le�n Archila, 14022
 *Jos� Pablo Ortega Grajeda, 14565
 *Dan Isa� Alvarez Ruano, 14628
 *Interfaz: Driver
 */

import java.util.Scanner;
import java.io.*;

public class Driver{

	public static void main (String[] args){
		int opcion1, opcion2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese 1 para StackVector, 2 para StackArrayList o 3 para StackList");
		opcion1 = sc.nextInt();
		if(opcion1 == 3){
			System.out.println("Ingrese 1 para SinglyLinkedList, 2 para DoublyLinkedList o 3 para CircularList");
			opcion2 = sc.nextInt();
		}
		String contenido = ""; //contendra el texto del archivo
		Calculadora calcu = CalculadoraHDT2.getCalculadora(opcion1, opcion2); //instancia de calculadora
		BufferedReader reader; //instancia para saber la cantidad de lineas
		int lines = 0; //se guardar� la cantidad de l�neas
		try {//revisa la cantidad de l�neas que hay en el archivo
			reader = new BufferedReader(new FileReader("datos.txt"));
			while (reader.readLine() != null) lines++;
			reader.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		
		try{//lee cada l�nea del archivo y realiza las operaciones
			contenido = ""; //guarda el contenido del documento
			Scanner s = new Scanner(new File("datos.txt")).useDelimiter("\\s"); //se crea el objeto Scanner que lee datos
			for (int i = 0; i < lines; i++){
				contenido = s.nextLine(); //lee
				System.out.println("Operaci�n ingresada: " + contenido);
				calcu.setString(contenido);
				calcu.meterVector();
				if(calcu.calcularVector() == false){
					System.out.println("Entrada incorrecta de datos\n");
				}
				else{
					System.out.println("Respuesta: " + calcu.getResultado() + "\n");
				}
			}
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}