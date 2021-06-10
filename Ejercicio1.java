import java.util.*;
import java.math.*;

public class Ejercicio1{

	public static void main(String[] args) {
		//definimos variables e importamos scanner
		Scanner scanner = new Scanner(System.in);
		double n, contadorImpar, contadorPar, numRandom, x;
		contadorImpar = 0;
		contadorPar = 0;

		//pedimos los datos
		System.out.println("Ingrese un numero entero: ");
		n = scanner.nextDouble();
		//definimos nuestas variables
		for (x = 1; x <= n ; x++) {
			numRandom = 1+Math.floor(Math.random()*100);
			System.out.println("Los numeros randomo son: "+numRandom);
			//creamos un ciclo donde nos dice si es par o impar
			if (numRandom%2==0) {
				contadorPar = contadorPar+1;			
			} else{
				contadorImpar = contadorImpar+1;
			}	
		}
		System.out.println("El total de numeros pares es: "+contadorPar);
		System.out.println("El total de numeros impares es: "+contadorImpar);
		
	}

}