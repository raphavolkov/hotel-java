package br.com.hotel.domain.entity.exceptions;

import br.com.hotel.domain.exception.DomainException;

public abstract class EntityException extends DomainException {
    protected EntityException(String message) {
        super(message);
    }
}
