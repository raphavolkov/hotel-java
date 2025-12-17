package br.com.hotel.domain.entity.exceptions;

public class ReservaNaoPodeSerConfirmadaException extends  RuntimeException{
    public ReservaNaoPodeSerConfirmadaException() {
        super("Reserva não pode ser confirmada");
    }
}
