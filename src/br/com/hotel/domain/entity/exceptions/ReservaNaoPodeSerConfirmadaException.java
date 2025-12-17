package br.com.hotel.domain.entity.exceptions;

public class ReservaNaoPodeSerConfirmadaException extends  EntityException{
    public ReservaNaoPodeSerConfirmadaException() {
        super("Reserva não pode ser confirmada");
    }
}
