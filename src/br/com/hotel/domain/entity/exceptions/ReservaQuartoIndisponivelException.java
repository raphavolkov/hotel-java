package br.com.hotel.domain.entity.exceptions;

public class ReservaQuartoIndisponivelException extends EntityException{
    public ReservaQuartoIndisponivelException() {
        super("Quarto indisponível");
    }
}
