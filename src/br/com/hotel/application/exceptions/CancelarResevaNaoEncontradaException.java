package br.com.hotel.application.exceptions;

public class CancelarResevaNaoEncontradaException extends RuntimeException {
    public CancelarResevaNaoEncontradaException() {
        super("Reserva não encontrada");
    }
}
