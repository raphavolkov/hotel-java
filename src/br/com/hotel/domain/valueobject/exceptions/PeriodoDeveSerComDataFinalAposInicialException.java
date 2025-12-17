package br.com.hotel.domain.valueobject.exceptions;

public class PeriodoDeveSerComDataFinalAposInicialException extends ValueObjectException{
    public PeriodoDeveSerComDataFinalAposInicialException() {
        super("Data final deve ser após a inicial.");
    }
}
