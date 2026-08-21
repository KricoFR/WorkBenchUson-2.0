
void main (){
	int a = 23;
/*	//========BLOQUE 1========\\
	double resultado1 = problema1(a);
	IO.println(resultado1);

	//========BLOQUE 2========\\
	double resultado2 = collatz(a);

	//========BLOQUE 3========\\
	pedirName();	
*/
	//========BLOQUE 4========\\
	

	//========BLOQUE 5========\\
}

/* Desmarca esta linea y la correspondiente para usar el bloque uno.
//==================== Bloque 1 ! ========================\\
 // Numero uno hacer un metodo llamado problema 1 que reciba como argumento un entero,
 //  a es par, el valor de retorno del metodo sera dos veces el valor original de a. 
 //  Si a==0 entonces el metodo uimprime a pantalla cero!!! y regresa el valore 50. 
 //  Si el valor es impar, entonces el metodo regresa Raiz'a.
 //
 //  
 //
double problema1 (int a) {

	//Si el numero es igual a cero se imprime 'cero!!!'
	if (a == 0) {
		IO.println("cero!!!");
		return 50;
	}

	//Si es par el numero, este imprime el doble del numero
	if (a % 2 == 0) {
		return a + a;
	}
	 
	//Si el numero es impar regresa una raiz cuadrada
	return Math.sqrt(a);


		
}
*/


/* desmarca esta linea y la correspondiente para usar el bloque dos.
//==================== Bloque 2 ! ========================\\
 // Escribe un metodo llamado collatz que reciba como argumento un entrero y que imprima 
 //  una secuencia de Collatz para ese entero. Si el entero recibido es negativo, no se 
 //  imprime nada y se termina el metodo instananeamente. de otra manera, la secuencia 
 //  de collatz se obtiene de la siguiente manera, si el numero recibido es par, se 
 //  divide entre 2. Si el numero recibido es impar, se multiplica.
 // El metodo solo se detiene cuando el resultado es igual a uno.
 //
 // 
double collatz (int a) {
	// Si el entero recibido es negativo no se imprime nada y se termina de inmediato
	if(a < 0) return a;
	
	// Si el entero es mayor a uno se empieza la secuencia
	while (a > 1) { 
		if(a % 2 == 0) {
			a = a / 2;
		} else {
			a = (a * 3) + 1;
		}
		IO.println(" -> " + a);
		
	}
	return a;
}
*/	


// desmarca esta linea y la correspondiente para usar el bloque tres.
//==================== Bloque 3 ! ========================\\
 // Haz un metodo llamado saludos que no reciba ningun argumento y que le pida al usuario
 //  entrada a traves de la consola. Le preguntara el nombre, la edad, y el lugar de
 //  de nacimiento del usuario.
 //
 //

void pedirName() {
	// Se imprime la instruccion al usuario
	IO.println("Bienvenido usuario, como te llamas?:\n ");
	// Se acciona el input
	String nameUser = IO.readln();
	//
	IO.println("Ok, sigamos con tu edad cuantos anios tienes? \n");
	String ageUser = IO.readln();
	//
	IO.println("Perfecto ya por ultimo en donde naciste?");
	String placeBornUser = IO.readln();
	//
	IO.println("Gracias " + nameUser + ", ahora te afiliare al PRI por ingenuo >:3 bai! \n");
}




//==================== Bloque 4 ! ========================\\



//==================== Bloque 5 ! ========================\\



