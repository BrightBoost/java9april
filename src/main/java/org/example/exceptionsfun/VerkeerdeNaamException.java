package org.example.exceptionsfun;

public class VerkeerdeNaamException extends RuntimeException {
    public VerkeerdeNaamException() {
    }

    public VerkeerdeNaamException(String message) {
        super(message);
    }

    public VerkeerdeNaamException(String message, Throwable cause) {
        super(message, cause);
    }

    public VerkeerdeNaamException(Throwable cause) {
        super(cause);
    }


}
