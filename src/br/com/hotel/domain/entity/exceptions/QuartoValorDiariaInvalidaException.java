package br.com.hotel.domain.entity.exceptions;

public class QuartoValorDiariaInvalidaException extends RuntimeException{
    public QuartoValorDiariaInvalidaException() {
        super("Valor diaria Invalida");
    }
}
