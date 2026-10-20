public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE ALMACENAMIENTO EN LA NUBE ===\n");

        Video videoTutorial = new Video("clase_poo_herencia.mp4", 450.8);
        SistemaLog logServidor = new SistemaLog("auth_server_error.log", 2.4);
        PerfilDeUsuario perfilAlumno = new PerfilDeUsuario("kristopher_dev");

        System.out.println("--- 1. Gestión de Archivos (ArchivoNube) ---");
        ArchivoNube[] misArchivos = { videoTutorial, logServidor };

        for (ArchivoNube archivo : misArchivos) {
            // mostrarInfo() se hereda de ArchivoNube
            System.out.println(archivo.mostrarInfo());
            // open() ejecuta la versión específica de cada subclase (Video o SistemaLog)
            System.out.println("Acción: " + archivo.open());
            System.out.println();
        }

        System.out.println("--- 2. Recursos Compartibles (Interfaz Compartible) ---");
        Compartible[] recursosCompartibles = { videoTutorial, perfilAlumno };

        for (Compartible recurso : recursosCompartibles) {
            System.out.println("Enlace generado: " + recurso.getEnlaceParaCompartir());
        }
    }
}