package br.com.hotel.domain.entity.exceptions;

public class ClienteComNomeObrigatorioException extends RuntimeException{
    public ClienteComNomeObrigatorioException() {
        super("Nome do cliente é obrigatorio");
    }
}
