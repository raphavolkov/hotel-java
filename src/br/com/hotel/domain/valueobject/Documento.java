package br.com.hotel.domain.valueobject;

import br.com.hotel.domain.valueobject.exceptions.DocumentoInvalidoException;

import java.util.Objects;

public class Documento {

    private final String valor;

    public Documento(String valor) {
        if(valor == null || valor.isBlank()){
            throw new DocumentoInvalidoException("Documento Invalido");
        }
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof Documento)) return false;
        Documento that = (Documento) o;
        return valor.equals(that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
