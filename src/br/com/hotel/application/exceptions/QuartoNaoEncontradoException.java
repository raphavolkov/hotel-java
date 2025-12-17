package br.com.hotel.application.exceptions;

import java.util.UUID;

public class QuartoNaoEncontradoException extends  UseCaseException{
    public QuartoNaoEncontradoException(UUID id) {
        super("Quarto não encontrado: " + id);
    }
}
