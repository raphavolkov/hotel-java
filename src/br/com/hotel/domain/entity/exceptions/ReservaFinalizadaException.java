package br.com.hotel.domain.entity.exceptions;

public class ReservaFinalizadaException extends EntityException{
    public ReservaFinalizadaException() {
        super("Reserva só pode ser finalizada se estiver confirmada");
    }
}
