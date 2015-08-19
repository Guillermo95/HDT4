/*Universidad del Valle de Guatemala
 *Algoritmos y Estructuras de Datos
 *Sección 30
 *Guillermo Javier de León Archila, 14022
 *José Pablo Ortega Grajeda, 14565
 *Dan Isaí Alvarez Ruano, 14628
 *Clase: CalculadoraHDT2
 */

public class CalculadoraHDT2 implements Calculadora {
	
	//atributos
	private String linea;
	private String[] lineaV;
	private int resultado;
	private int num1, num2;
	Stack<Integer> miStack;
	//atributo que contiene la instancia de CalculadoraHDT2
	private static CalculadoraHDT2 miCalc;
	
	//metodos
	
	//este metodo se utiliza para crear una instancia unica de la clase, una vez creada la instancia 
	//esta no se modifica.
	public static Calculadora getCalculadora(int opcion1, int opcion2){
		if(miCalc==null)
			miCalc=new CalculadoraHDT2(opcion1, opcion2);
		return miCalc;
	}
	//el constructor privado no permite acceso desde otras clases
	//solo puede ser llamado por el metodo getCalculadora
	private CalculadoraHDT2(int opcion1, int opcion2){
		StackFactory<Integer> sfactory = new StackFactory<Integer>();
		miStack = sfactory.getStack(opcion1, opcion2);
	}
	
	public void setString(String linea){
		this.linea = linea;
	}
	public void meterVector(){
		lineaV = new String[linea.replaceAll("\\s","").length()]; //guarda el cotenido del documento separado en un vector
		lineaV = linea.split("\\s"); //separa caracteres cada vez que encuentra un espacio y los inserta en un vector
	}
	public boolean calcularVector(){
		try{ //revisa si la última posición del vector es un número o un operador
			Integer.parseInt(lineaV[lineaV.length - 1]);
			return false;
		}
		catch (NumberFormatException e){}
		for(int i = 0; i < lineaV.length; i++){//revisa cada posición, si es un numero lo mete a la pila, y si es un caracter, revisa que sea un operador correcto, y si hay suficienter parametros en la pila para realizar la operacion
			try{
				num1 = Integer.parseInt(lineaV[i]);
				if(num1 <=9){
					miStack.push(num1);
				}
				else{
					return false;
				}
			}
			catch(NumberFormatException e){
				if(miStack.size() >= 2){
					num1 = miStack.pop();
					num2 = miStack.pop();
					if(lineaV[i].equals("+")){
						miStack.push(num1 + num2);
					}
					else if(lineaV[i].equals("-")){
						miStack.push(num2 - num1);
					}
					else if(lineaV[i].equals("*")){
						miStack.push(num1 * num2);
					}
					else if(lineaV[i].equals("/")){
						if(num1 == 0){
							return false;
						}
						else{
							miStack.push(num2 / num1);
						}
					}
					else{
						return false;
					}
				}
				else{
					return false;
				}
			}
		}
		return true;
	}
	public int getResultado(){
		resultado = miStack.pop();
		return resultado;
	}
}