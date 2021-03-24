import java.util.Scanner;

public class Saludo {
	
	public static void main(String arg[]) {
		
		/*String linea = "";
		
		Scanner ent = new Scanner(System.in);
		System.out.println("Buenos días Ceinmark, soy Marta Gómez");
		linea = ent.next();
		System.out.println("Hola " + linea);*/
		
		System.out.println("Hola");
		System.out.println("Introduce un número para averiguar si es primo o no:");
		int contador=0;;
		int I=0;
		int numero =0;
		Scanner ent = new Scanner(System.in);
        
 
        System.out.print("Ingresa un numero: ");
        numero = ent.nextInt();
 
        contador = 0;
 
        for(I = 1; I <= numero; I++)
        {
            if((numero % I) == 0)
            {
                contador++;
            }
        }
 
        if(contador <= 2)
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
	}

}
