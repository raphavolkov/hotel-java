package br.com.hotel.domain.entity.exceptions;

public class ClienteComDocumentoEEmailObrigatoriosException extends RuntimeException{
    public ClienteComDocumentoEEmailObrigatoriosException() {
        super("Documento e email são obrigatórios");
    }
}
