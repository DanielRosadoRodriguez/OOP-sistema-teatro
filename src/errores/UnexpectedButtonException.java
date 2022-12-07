package errores;

public class UnexpectedButtonException extends Exception {

    public UnexpectedButtonException() {
        super("el botón presionado no corresponse a un botón del arreglo");
    }

}