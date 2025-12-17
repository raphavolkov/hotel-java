package br.com.hotel.domain.valueobject;

import br.com.hotel.domain.valueobject.exceptions.PeriodoComDatasNulasException;
import br.com.hotel.domain.valueobject.exceptions.PeriodoDeveSerComDataFinalAposInicialException;

import java.time.LocalDate;
import java.util.Objects;

public class Periodo {

    private final LocalDate inicio;
    private final LocalDate fim;

    public Periodo(LocalDate inicio, LocalDate fim) {
        if (inicio == null || fim == null) {
            throw new PeriodoComDatasNulasException();
        }

        if (!fim.isAfter(inicio)) {
            throw new PeriodoDeveSerComDataFinalAposInicialException();
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
        Objects.requireNonNull(outro);
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
