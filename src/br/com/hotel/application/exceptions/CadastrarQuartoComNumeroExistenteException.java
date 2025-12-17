package br.com.hotel.application.exceptions;

public class CadastrarQuartoComNumeroExistenteException extends RuntimeException{
    public CadastrarQuartoComNumeroExistenteException() {
        super("Já existe um quarto com esse numero");
    }
}
