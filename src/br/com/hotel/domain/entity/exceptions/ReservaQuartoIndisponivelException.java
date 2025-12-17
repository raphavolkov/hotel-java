package br.com.hotel.domain.entity.exceptions;

public class ReservaQuartoIndisponivelException extends RuntimeException{
    public ReservaQuartoIndisponivelException() {
        super("Quarto indisponível");
    }
}
