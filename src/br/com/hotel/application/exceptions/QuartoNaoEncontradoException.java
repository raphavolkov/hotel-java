package br.com.hotel.application.exceptions;

import java.util.UUID;

public class QuartoNaoEncontradoException extends  RuntimeException{
    public QuartoNaoEncontradoException(UUID id) {
        super("Quarto não encontrado: " + id);
    }
}
