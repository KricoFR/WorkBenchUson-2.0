public class SistemaLog extends ArchivoNube {
    public SistemaLog(String nombre, double tamanio) {
        super(nombre, tamanio);
    }

    @Override
    public String open() {
        return "Abriendo el registro del sistema " + this.nombre;
    }
}