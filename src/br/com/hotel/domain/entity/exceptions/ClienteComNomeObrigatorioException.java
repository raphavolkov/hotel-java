package br.com.hotel.domain.entity.exceptions;

public class ClienteComNomeObrigatorioException extends EntityException{
    public ClienteComNomeObrigatorioException() {
        super("Nome do cliente é obrigatorio");
    }
}
