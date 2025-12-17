package br.com.hotel.domain.valueobject.exceptions;

public class EmailNuloOuVazioException extends ValueObjectException {
    public EmailNuloOuVazioException() {
        super("O email não pode ser nulo ou vazio.");
    }
}
