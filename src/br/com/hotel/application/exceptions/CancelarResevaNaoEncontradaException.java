package br.com.hotel.application.exceptions;

public class CancelarResevaNaoEncontradaException extends UseCaseException {
    public CancelarResevaNaoEncontradaException() {
        super("Reserva não encontrada");
    }
}
