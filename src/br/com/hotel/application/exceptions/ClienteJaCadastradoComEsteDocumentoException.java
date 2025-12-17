package br.com.hotel.application.exceptions;

public class ClienteJaCadastradoComEsteDocumentoException extends UseCaseException{
    public ClienteJaCadastradoComEsteDocumentoException() {
        super("Cliente ja cadastrado com este documento");
    }
}
