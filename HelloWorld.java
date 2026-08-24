void main () {
	int x = 30;
	float $x = 3.14159f;
	IO.println("Hello World");
	IO.println(square(x));
	IO.println(square($x));

}

int square(int x) {
	return x * x;

}

float square(float $x) {
	return $x * $x;
}






