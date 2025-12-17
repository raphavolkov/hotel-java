package br.com.hotel.domain.valueobject.exceptions;

public class PeriodoComDatasNulasException extends ValueObjectException {
    public PeriodoComDatasNulasException() {
        super("Datas não podem ser nulas");
    }
}
