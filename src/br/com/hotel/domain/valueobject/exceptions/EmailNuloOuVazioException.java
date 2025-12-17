package br.com.hotel.domain.valueobject.exceptions;

public class EmailNuloOuVazioException extends RuntimeException{
    public EmailNuloOuVazioException() {
        super("O email não pode ser nulo ou vazio.");
    }
}
