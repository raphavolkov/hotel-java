package br.com.hotel.domain.entity.exceptions;

public class ReservaComClienteQuartoPeriodoObrigatoriosException extends EntityException{
    public ReservaComClienteQuartoPeriodoObrigatoriosException() {
        super("Cliente, quarto e período são obrigatórios");
    }
}
