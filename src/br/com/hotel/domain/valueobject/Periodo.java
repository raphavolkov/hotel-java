package br.com.hotel.domain.valueobject;

import br.com.hotel.domain.valueobject.exceptions.PeriodoInvalidoException;

import java.time.LocalDate;
import java.util.Objects;

public class Periodo {

    private final LocalDate inicio;
    private final LocalDate fim;

    public Periodo(LocalDate inicio, LocalDate fim) {
        if (inicio == null || fim == null) {
            throw new PeriodoInvalidoException("Datas não podem ser nulas"); // TRATAR
        }

        if (!fim.isAfter(inicio)) {
            throw new PeriodoInvalidoException("Data final deve ser após a inicial."); // TRATAR
        }

        this.inicio = inicio;
        this.fim = fim;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public boolean conflitaCom(Periodo outro) {
        return inicio.isBefore(outro.fim) && fim.isAfter(outro.inicio);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Periodo)) return false;
        Periodo periodo = (Periodo) o;
        return inicio.equals(periodo.inicio) && fim.equals(periodo.fim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inicio, fim);
    }
}
