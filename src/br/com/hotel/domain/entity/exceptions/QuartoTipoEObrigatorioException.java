package br.com.hotel.domain.entity.exceptions;

public class QuartoTipoEObrigatorioException extends RuntimeException{
    public QuartoTipoEObrigatorioException() {
        super("Tipo do quarto é obrigatório");
    }
}
