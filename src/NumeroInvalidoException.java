public class NumeroInvalidoException extends RuntimeException{
    public NumeroInvalidoException(String message) {
        super(message);
    }
    public NumeroInvalidoException(String message,Throwable cause) {
        super(message, cause);
    }
}
