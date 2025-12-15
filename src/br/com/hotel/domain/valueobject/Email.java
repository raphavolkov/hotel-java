package br.com.hotel.domain.valueobject;

import br.com.hotel.domain.valueobject.exceptions.EmailInvalidoException;
import java.util.Objects;
import java.util.regex.Pattern;

public class Email {

    private final String valor;

    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public Email(String valor) {
        if (valor == null || valor.isEmpty() || valor.isBlank()){
            throw new EmailInvalidoException("O email não pode ser nulo ou vazio.");
        }

        if (!EMAIL_PATTERN.matcher(valor).matches()){
            throw new EmailInvalidoException("O formato do email fornecido é inválido: " + valor);
        }
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Email)) return false;
        Email email = (Email) o;
        return valor.equals(email.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}