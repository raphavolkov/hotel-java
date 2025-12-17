package br.com.hotel.domain.valueobject.exceptions;

public class EmailComFormatoInvalidoException extends ValueObjectException {
    public EmailComFormatoInvalidoException() {
        super("O formato do email fornecido é inválido");
    }
}
