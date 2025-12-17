package br.com.hotel.application.exceptions;

import br.com.hotel.domain.exception.DomainException;

public abstract class UseCaseException extends DomainException {
    protected UseCaseException(String message) {
        super(message);
    }
}
