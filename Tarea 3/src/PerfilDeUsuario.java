public class PerfilDeUsuario implements Compartible {
    private String nombreDeUsuario;

    // Constructor propio de la clase
    public PerfilDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    // 5.2 Implementación del contrato de la interfaz Compartible
    @Override
    public String getEnlaceParaCompartir() {
        return "https://minube.com/usuarios/perfil/" + this.nombreDeUsuario;
    }

    // Getter opcional por buena práctica
    public String getNombreDeUsuario() {
        return this.nombreDeUsuario;
    }
}




/*  protected String nombre;
    protected double tamanio;

    public ArchivoNube(String nombre, double tamanio) {
        this.nombre;
        this.tamanio;
    }

    public String mostrarInfo() {
        return "Archivo: " + this.nombre + " | Tamanio: " + this.tamanio + " MB";
    }

    public void abrir() {
        System.out.println("Abriendo archivo absatracto...");
    }

    public abstract String open();
} */