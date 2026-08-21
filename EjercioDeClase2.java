
void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		imprimirArray(arr);
		reverse(arr);
		IO.println("");
		imprimirArray(arr);
}

void reverse(int[] arr) {
	int izq = 0;
	int der = arr.length - 1;
	while (izq < der) {
		int temp = arr[izq];
		arr[izq++] = arr[der];
		arr[der--] = temp;
	
	}
}



void imprimirArray(int[] arr) {
	for (int num : arr) {
		IO.println(num + " ");
	}
}
