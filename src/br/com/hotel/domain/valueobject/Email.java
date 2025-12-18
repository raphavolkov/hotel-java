package br.com.hotel.domain.valueobject;

import br.com.hotel.domain.valueobject.exceptions.EmailComFormatoInvalidoException;
import br.com.hotel.domain.valueobject.exceptions.EmailNuloOuVazioException;

import java.util.Objects;
import java.util.regex.Pattern;

public class Email {

    private final String valor;

    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public Email(String valor) {
        if (valor == null || valor.isBlank()){
            throw new EmailNuloOuVazioException();
        }

        if (!EMAIL_PATTERN.matcher(valor).matches()){
            throw new EmailComFormatoInvalidoException();
        }
        this.valor = valor.trim().toLowerCase();
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Email email)) return false;
        return valor.equals(email.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}