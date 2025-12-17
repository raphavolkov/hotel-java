package br.com.hotel.application.exceptions;

import java.util.UUID;

public class ClienteNaoEncontradoException extends RuntimeException{
    public ClienteNaoEncontradoException(UUID id) {
        super("CLiente não encontrado: " + id);
    }
}
