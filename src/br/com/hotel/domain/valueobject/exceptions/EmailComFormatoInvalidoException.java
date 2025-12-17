package br.com.hotel.domain.valueobject.exceptions;

public class EmailComFormatoInvalidoException extends RuntimeException{
    public EmailComFormatoInvalidoException(String valor) {
        super("O formato do email fornecido é inválido: " + valor);
    }
}
