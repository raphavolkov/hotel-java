package br.com.hotel.domain.entity.exceptions;

public class ClienteEmailNaoPodeSerNuloException extends RuntimeException{
    public ClienteEmailNaoPodeSerNuloException() {
        super("Email não pode ser nulo");
    }
}
