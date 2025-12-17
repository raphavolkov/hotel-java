package br.com.hotel.application.exceptions;

public class CadastrarQuartoComNumeroExistenteException extends UseCaseException{
    public CadastrarQuartoComNumeroExistenteException() {
        super("Já existe um quarto com esse numero");
    }
}
