package Actividad4;
import java.util.Arrays;
import java.util.Scanner;
public class  Actividad4Programaconjuntos { 
	Scanner e = new Scanner(System.in);
	
	
	int A[];
	int b[];
	
	public static boolean AnumerosPrimos(int numero) {
		int contador =100;
		boolean primo=true;
		while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		}
		return primo;
		
	}
	public static boolean contador (int numero) {
		return false;
	}
	public static boolean BNumerosDivisores(int numero) {
		int contador =350;
		boolean divisor=true;
		for (int i = 1 ; i <= contador ; i++)
            if (contador % i == 0)
		return divisor;
		return divisor;
		}
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

		

