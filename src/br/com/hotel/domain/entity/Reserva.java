package br.com.hotel.domain.entity;

import br.com.hotel.domain.entity.exceptions.ReservaComClienteQuartoPeriodoObrigatoriosException;
import br.com.hotel.domain.entity.exceptions.ReservaFinalizadaException;
import br.com.hotel.domain.entity.exceptions.ReservaNaoPodeSerConfirmadaException;
import br.com.hotel.domain.entity.exceptions.ReservaQuartoIndisponivelException;
import br.com.hotel.domain.enums.StatusReserva;
import br.com.hotel.domain.valueobject.Periodo;

import java.util.UUID;

public class Reserva {

   private final UUID id;
   private final Cliente cliente;
   private final Quarto quarto;
   private final Periodo periodo;
   private StatusReserva status;

   public Reserva(Cliente cliente, Quarto quarto, Periodo periodo) {
       if (cliente == null || quarto == null || periodo == null) {
           throw new ReservaComClienteQuartoPeriodoObrigatoriosException();
       }

       this.id = UUID.randomUUID();
       this.cliente = cliente;
       this.quarto = quarto;
       this.periodo = periodo;
       this.status = StatusReserva.CRIADA;
   }

   public void confirmar(){
       if (status != StatusReserva.CRIADA){
           throw new ReservaNaoPodeSerConfirmadaException();
       }

       if (!quarto.isDisponivel()) {
           throw new ReservaQuartoIndisponivelException();
       }

       this.status = StatusReserva.CONFIRMADA;
       quarto.marcarIndisponivel();
   }

   public void cancelar(){
       if(status == StatusReserva.FINALIZADA){
           throw new ReservaFinalizadaException();
       }

       if (status == StatusReserva.CONFIRMADA) {
           quarto.marcarDisponivel();
       }

       this.status = StatusReserva.CANCELADA;
   }

   public void finalizar(){
       if(status != StatusReserva.CONFIRMADA){
           throw new ReservaFinalizadaException();
       }

       this.status = StatusReserva.FINALIZADA;
       quarto.marcarDisponivel();
   }

    public Periodo getPeriodo() {
        return periodo;
    }
}
