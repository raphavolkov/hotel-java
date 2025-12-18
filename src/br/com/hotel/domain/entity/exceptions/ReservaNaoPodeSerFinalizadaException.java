package br.com.hotel.domain.entity.exceptions;

public class ReservaNaoPodeSerFinalizadaException extends EntityException{
    public ReservaNaoPodeSerFinalizadaException() {
        super("Reserva só pode ser finalizada se estiver confirmada");
    }
}
