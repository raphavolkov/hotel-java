package br.com.hotel.domain.valueobject.exceptions;

public class PeriodoComDatasNulasException extends RuntimeException{
    public PeriodoComDatasNulasException() {
        super("Datas não podem ser nulas");
    }
}
