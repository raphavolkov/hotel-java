package br.com.hotel.domain.valueobject.exceptions;

public class DocumentoInvalidoException extends RuntimeException{
        public DocumentoInvalidoException() {
            super("Documento Invalido");
        }
}
