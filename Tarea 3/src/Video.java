public class Video extends ArchivoNube implements Compartible {

    public Video(String nombre, double tamanio) {
        super(nombre, tamanio);
    }

    @Override
    public String open() {
        return "Abriendo el video " + this.nombre;
    }

    @Override
    public String getEnlaceParaCompartir() {
        return "https://minube.com/compartir/video/" + this.nombre;
    }
}