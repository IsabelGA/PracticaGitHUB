package Calculadora;

/**
 * 
 * @author isabel
 * 
 */

public class Calculadora {


	double op1;
	double op2;
	
	/**
	 * Aqui se declaran los operandos, op1 y op2,con los que trabajaremos,
	 * para cada numero de la calculadora:	
	 *  @param op1: operando 1
	 *  @param op2: operando 2
	 */	
	
	
	public Calculadora(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
		
		/**
		 * Este es el constructor del programa Calculadora.
		 * 
		 */
	}
	
	
	
	
	
	public double suma() {
		return op1+op2;
		/**
		 * 
		 *Con esta funcion sumaremos los dos operandos y devolverá el resultado.
		 *
		 *@return op1+op2 : devuelve la suma
		 * 
		 */
		
	}
	
	
	
	
	public double resta() {
		return op1-op2;
		/**
		 * Con esta funcion restaremos el operando 1 menos operando 2, y devolvera el resultado.
		 * @return op1-op2 : devuelve la resta
		 */
	}
	
	public double division() {
		if(op2==0) {
			throw new IllegalArgumentException("El divisor es 0");
			/**
			 * @throw da error si se divide por 0
			 */
		}
		return op1/op2;
		/**
		 * Con esta funcion dividiremos el valor del op1, por el valor del op2, y devolverá el resul-
		 * tado, si el operando 2 es un divisor adecuado ( es decir, es mayor de 0).
		 * 
		 * @return op1/op2 : devuelve la division
		 * 
		 */
		
		
	}
	
	
	public double potencia() {
		if(op1==0) {
			return 1;
			/**
			 * @return devuelve 1 si el op2 es 0
			 */
		}
		if(op2 <0) {
			return -Math.pow(op1, op2);
		}return Math.pow(op1, op2);
		
		/**
		 * En esta parte realizamos la potencia
		 * @return Math.pow(op1,op2) : devuelve la potencia
		 */
	}

	@Override
	public String toString() {
		return "Calculadora de Isa:\nOperando1 = " +op1+ "\nOperando2 = "+op2;
		/**
		 * @return devuelve el autor y los numeros con los que se esta operando
		 */
	}
	
	 
	
	//TODO: A�adir la operaci�n potencia, que devuelve
	//op1 elevado a op2 con las siguientes reglas: 
	//-Por convenio cualquier n�mero elevado a 0 es igual a 1.
	//-Un n�mero "n" elevado a una potencia negativa "-p" es igual a 1/(n^p)
	//As� 232^0 = 1; y 2^(-3)=1/2^3=1/8
	
	
	//TODO: A�adir la operacion toString que devuelva los operandos
	//la cadena:
	//"Calculadora de <vuestroNombre>: "
	//"operando1 = <op1>"
	//"operando2 = <op2>"
	
}
