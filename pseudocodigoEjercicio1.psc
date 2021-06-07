Algoritmo pseudocodigoEjercicio1
	Escribir "Ingrese un numero entero: "
	Leer N
	contadorImpar = 0
	contadorPar = 0
	Para x=1 Hasta N Hacer
		num_random<-1+azar(100)
		Escribir "Los numeros random son: ",num_random
		si num_random mod 2 == 0 Entonces
			contadorPar = contadorPar+1
		SiNo
			contadorImpar = contadorImpar+1
			
		FinSi
	FinPara
	Escribir "EL total de numeros pares es: ",contadorPar
	Escribir "El total de numeros impares es: ",contadorImpar
FinAlgoritmo
