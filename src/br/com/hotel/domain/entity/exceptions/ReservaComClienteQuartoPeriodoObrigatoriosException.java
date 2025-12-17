package br.com.hotel.domain.entity.exceptions;

public class ReservaComClienteQuartoPeriodoObrigatoriosException extends RuntimeException{
    public ReservaComClienteQuartoPeriodoObrigatoriosException() {
        super("Cliente, quarto e período são obrigatórios");
    }
}
