
void main(String[] args) {
	int[] primos = getPrimos (10,100);
	
}

/* int[] buffer = new int[b-a] {
 * int currentIdx = 0;
 * for( int i=a; i <= b; ++i)
 * 	if(esPrimo(i)) {
 * 	buffer[currentIdx++] = i;
 *
 * 	}
 * }
 
   */
void problema1(int n) {
        for(int i = 2; i<=n ; ++i) {
                if (esPrimo(i)) IO.println(i);
        }
}


boolean esPrimo (int i) {
        if( i % 2 == 0) return false;

        for(int n = 3; n < i ; n += 2) {
                if (i % n ==0 )
                        return false;
        }

        return true;
}


