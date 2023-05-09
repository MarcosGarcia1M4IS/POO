package amama;

public class propiedades {
int a, b; //atributos

public propiedades(int a, int b) {
	// TODO Auto-generated constructor stub
this.a =a;
this.b = b;

//metodo set, get
}

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}

public static int Mult(int a, int b) {
	int mult;
	
	mult = a * b;
	
	return mult;
}

public void saludar() {
	System.out.println("Hola");
}

}
