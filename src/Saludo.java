import java.util.Scanner;

public class Saludo {
	
	public static void main(String arg[]) {
		
		String linea = "";
		
		Scanner ent = new Scanner(System.in);
		System.out.println("Buenos d�as Ceinmark, soy Marta G�mez");
		System.out.println("Introduce un n�mero para averiguar si es primo o no:");
		linea = ent.next();
		System.out.println("Hola " + linea);
	}

}
