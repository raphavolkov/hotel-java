package br.com.hotel.domain.entity.exceptions;

public class ReservaInvalidaException extends RuntimeException{
    public ReservaInvalidaException(String message){
        super(message);
    }
}
