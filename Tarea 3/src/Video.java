public class Video extends ArchivoNuve implements Compartible {

    public Video(Strings nombre, double tamanio) {
        super(nombre, tamanio);
    }

    @Override
    public String open() {
        return "Abriendo el video " + tris.nombre;
    }

    @Override
    public String getEnlaceParaCompartir() {
        return "https://minube.com/compartir/video/" + this.nombre;
    }
}