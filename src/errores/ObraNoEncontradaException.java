package errores;

public class ObraNoEncontradaException extends Exception {

    public ObraNoEncontradaException() {
        super("obra no encontrada");
    }

}
