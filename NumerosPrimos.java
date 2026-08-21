void main() {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("=== PROGRAMA INTEGRADO EN JAVA 25 ===");
    System.out.println("1. Imprimir números primos del 1 al N (if, for, break)");
    System.out.println("2. Calcular puntaje de un número (while, switch, continue)");
    System.out.println("3. Sumar dígitos con mensajes especiales (while, switch, yield)");
    System.out.print("Selecciona una opción (1-3): ");

    int opcion = scanner.nextInt();

    switch (opcion) {
        case 1 -> {
            System.out.print("Ingresa el valor de N: ");
            int n = scanner.nextInt();
            imprimirPrimos(n);
        }
        case 2 -> {
            System.out.print("Ingresa el número para calcular su puntaje: ");
            long numero = scanner.nextLong();
            calcularPuntaje(numero);
        }
        case 3 -> {
            System.out.print("Ingresa el número para sumar sus dígitos: ");
            long numero = scanner.nextLong();
            sumarDigitosEspecial(numero);
        }
        default -> System.out.println("Opción no válida.");
    }

    scanner.close();
}

// 1. Imprime números primos entre 1 y n usando if, for y break
void imprimirPrimos(int n) {
    System.out.println("\n--- Números primos del 1 al " + n + " ---");
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
    System.out.println();
}

// 2. Calcula el puntaje de un número usando while, switch y continue
void calcularPuntaje(long numero) {
    System.out.println("\n--- Cálculo de Puntaje ---");
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
            case 0 -> anularSiguiente = true; // Hace que el dígito a la izquierda valga 0
            case 2, 3, 4, 5 -> puntajeTotal += 20;
            case 1, 6, 7, 8, 9 -> puntajeTotal += 10;
        }
    }

    System.out.println("El puntaje total del número " + numero + " es: " + puntajeTotal);
}

// 3. Suma los dígitos de un número usando while, switch y yield
void sumarDigitosEspecial(long numero) {
    System.out.println("\n--- Suma de Dígitos Especial ---");
    long temp = Math.abs(numero);
    int sumaTotal = 0;

    while (temp > 0) {
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

    System.out.println("La suma total es: " + sumaTotal);
}
