//Hacer un programa que imprima los numeros primos del desde 1 hasta n (utiliza if for break)

void main() {
	int n = 100;
	problema1(n);
}
//ejecuta la validacion del numero
void problema1(int n) {
	for(int i = 2; i<=n ; ++i) {
		if (esPrimo(i)) IO.println(i);
	}
}
//corrobora que un numero de una variable es par regresa un boleano
boolean esPrimo (int i) {
	if( i % 2 == 0) return false;
	
	for(int n = 3; n < i ; n += 2) {
		if (i % n ==0 )
			return false;
	}

	return true;
}

