package br.com.hotel.domain.entity.exceptions;

public class QuartoComCapacidadeInvalidaException extends RuntimeException{
    public QuartoComCapacidadeInvalidaException() {
        super("Capacidade Invalida");
    }
}
