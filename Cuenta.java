package prueba;
import java.util.Scanner;
public class Cuenta {



		String titular;
		double  cantidad, cantidadActual;
		
		Scanner tc = new Scanner(System.in);
		public Cuenta(String titular, double cantidad, double cantidadActual) {
			super();
			this.titular = titular;
			this.cantidad = cantidad;
			this.cantidadActual = cantidadActual;
		}
		
		public void setTitular(String titular) {
			this.titular = titular;
		}
		
		public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
		}
		
		public void setCantidadActual(double cantidadActual) {
			this.cantidadActual = cantidadActual;
		}
		
		public void ingresarTitular() {
			System.out.println("Ingrese el títular de la cuenta");
		titular = tc.nextLine();
		}
		
		
		public String getTitular() {
			return titular;
		}
	//-------------------------------------------------------------------------------	
		public void  ingresar() {
			
			System.out.println("Ingrese la cantidad que desea: ");
			cantidad = tc.nextDouble();
			tc.nextLine();
			
			if(cantidad<0) {
				System.out.println("Cantidad menor a cero, Error");
				System.exit(0);
			}else {
				cantidadActual = cantidadActual + cantidad;
				System.out.println("Dinero ingresado exitosamente");
			System.out.println("cantidad de dinero en la cuenta: C$" + cantidadActual);
			
			}
		}
		
		public double getCantidad() {
			return cantidad;
		}
		
	
//-----------------------------------------------------------------------------------------------		
		
		
		public void retirar() {
		
			System.out.println("Ingrese la cantidad a retirar");
			cantidad = tc.nextDouble();
			tc.nextLine();
			if(cantidad< 0) {
			System.out.println("Deposito Invalido");

			}else if(cantidadActual - cantidad < 0) {
		  cantidadActual = 0;
		  System.out.println("Ya no tiene dinero en la cuenta!!" );
		  System.out.println("Cantidad Actual:  C$" + cantidadActual);
		} else {
		cantidadActual = cantidadActual -cantidad;
		System.out.println("Dinero restante de la cuenta:  C$" + cantidadActual);
		
		}
		
		}

}
