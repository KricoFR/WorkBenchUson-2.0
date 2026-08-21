void main() {
    int n = 30; // Puedes cambiar el valor de n

    System.out.println("Números primos entre 1 y " + n + ":");

    for (int i = 2; i <= n; i++) {
        boolean esPrimo = true;

        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                esPrimo = false;
                break; // Detiene la verificación al encontrar un divisor
            }
        }

        if (esPrimo) {
            System.out.print(i + " ");
        }
    }
}

void main() {
    long numero = 12049L; // Número de prueba
    long temp = Math.abs(numero);
    int puntajeTotal = 0;
    boolean anularSiguiente = false;

    while (temp > 0) {
        int digito = (int) (temp % 10);
        temp /= 10;

        if (anularSiguiente) {
            anularSiguiente = false;
            continue; // Salta el procesamiento y otorga 0 puntos a este dígito
        }

        switch (digito) {
            case 0 -> {
                anularSiguiente = true; // Hace que el dígito a la izquierda valga 0
            }
            case 2, 3, 4, 5 -> puntajeTotal += 20;
            case 1, 6, 7, 8, 9 -> puntajeTotal += 10;
        }
    }

    System.out.println("El puntaje total del número " + numero + " es: " + puntajeTotal);
}

void main() {
    long numero = 90571L; // Número de prueba
    long temp = Math.abs(numero);
    int sumaTotal = 0;


        int digito = (int) (temp % 10);
        temp /= 10;

        int valorDigito = switch (digito) {
            case 0 -> {
                System.out.println("ceroooo!!!");
                yield 10;
            }
            case 5 -> {
                System.out.println("yihaaa!");
                yield 1;
            }
            case 7 -> {
                System.out.println("el de la suerte!");
                yield 2;
            }
            default -> {
                yield digito; // Los demás dígitos conservan su valor numérico real
            }
        };

        sumaTotal += valorDigito;
    }

   // System.out.println("La suma total es: " + sumaTotal);
//}
