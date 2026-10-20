//===================================================
public abstract class ArchivoNube {
    protected String nombre;
    protected double tamanio;

    //==================Constructor==================
    public ArchivoNube(String nombre, double tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
    }
    //=============Regresa nombre y tamanio==========
    public String mostrarInfo() {
        return "Archivo: " + this.nombre + " | Tamanio: " + this.tamanio + " MB";
    }
    //=============Abrir el archivo==================
    public abstract String open();

    public String getNombre() {
        return nombre;
    }

    public double getTamanio() {
        return tamanio;
    }

}

