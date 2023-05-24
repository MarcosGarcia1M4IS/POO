package prueba;
import java.util.Scanner;
public class CuentaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int opcion = 0;
			Scanner tc = new Scanner(System.in);

			Cuenta op = new Cuenta(null, 0,0);

			while(opcion != 3) {

			System.out.println("Ingrese la opción que desea: ");
			System.out.println("1. Depositar");
			System.out.println("2. Retirar");
			System.out.println("3. Salir");
			opcion = tc.nextInt();
					

			switch(opcion) {
			case 1: 
				op.ingresarTitular();
				op.ingresar();
				break;
			case 2: 
				op.ingresarTitular();
				op.retirar();
				break;
			case 3:
			System.out.println("Saliendo...");	
				break;
			}
				}
			
			tc.close();			
		}catch(java.util.InputMismatchException j) {
			System.out.println("Error");
		}

}
}