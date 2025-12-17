package br.com.hotel.application.exceptions;

import java.util.UUID;

public class QuartoIndisponivelNoPeriodoException extends UseCaseException{
    public QuartoIndisponivelNoPeriodoException(UUID id) {
        super("Quarto indisponivel no periodo: " + id);
    }
}
