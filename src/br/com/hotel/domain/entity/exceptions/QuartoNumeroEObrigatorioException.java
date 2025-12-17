package br.com.hotel.domain.entity.exceptions;

public class QuartoNumeroEObrigatorioException extends EntityException{
    public QuartoNumeroEObrigatorioException() {
        super("Número do quarto é obrigatório");
    }
}
