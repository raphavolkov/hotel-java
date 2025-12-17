package br.com.hotel.domain.valueobject.exceptions;

import br.com.hotel.domain.exception.DomainException;

public abstract class ValueObjectException extends DomainException {
    protected ValueObjectException(String message) {
        super(message);
    }
}
