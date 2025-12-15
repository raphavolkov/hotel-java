package br.com.hotel.domain.entity.exceptions;

public class QuartoInvalidoException extends RuntimeException{
    public QuartoInvalidoException(String mensage){
        super(mensage);
    }
}
