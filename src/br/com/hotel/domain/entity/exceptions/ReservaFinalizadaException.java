package br.com.hotel.domain.entity.exceptions;

public class ReservaFinalizadaException extends RuntimeException{
    public ReservaFinalizadaException() {
        super("Reserva só pode ser finalizada se estiver confirmada");
    }
}
