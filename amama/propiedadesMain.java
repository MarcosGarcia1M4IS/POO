package amama;
import java.util.Scanner;
public class propiedadesMain {
 
	
	public static void main (String args []) {
	Scanner tc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Ingrese un número");
		x = tc.nextInt();
		System.out.println("Ingrese un número");
		y = tc.nextInt();
		
		
		propiedades po = new propiedades(x,y);
		
		
		po.saludar();
		
		System.out.println("El resultado es: " + po.Mult(x, y));
		
		
	}
	
}
