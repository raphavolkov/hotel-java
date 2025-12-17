package br.com.hotel.domain.entity.exceptions;

public class QuartoNumeroEObrigatorioException extends RuntimeException{
    public QuartoNumeroEObrigatorioException() {
        super("Número do quarto é obrigatório");
    }
}
