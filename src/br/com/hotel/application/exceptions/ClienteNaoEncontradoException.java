package br.com.hotel.application.exceptions;

import java.util.UUID;

public class ClienteNaoEncontradoException extends UseCaseException{
    public ClienteNaoEncontradoException(UUID id) {
        super("CLiente não encontrado: " + id);
    }
}
