package br.com.hotel.domain.entity;

import br.com.hotel.domain.entity.exceptions.ReservaInvalidaException;
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
           throw new ReservaInvalidaException("Cliente, quarto e período são obrigatórios");
       }

       this.id = UUID.randomUUID();
       this.cliente = cliente;
       this.quarto = quarto;
       this.periodo = periodo;
       this.status = StatusReserva.CRIADA;
   }

   public void confirmar(){
       if (status != StatusReserva.CRIADA){
           throw new ReservaInvalidaException("Reserva não pode ser confirmada"); // TRATAR
       }

       if (!quarto.isDisponivel()) {
           throw new ReservaInvalidaException("Quarto indisponível");
       }

       this.status = StatusReserva.CONFIRMADA;
       quarto.marcarIndisponivel();
   }

   public void cancelar(){
       if(status == StatusReserva.FINALIZADA){
           throw new ReservaInvalidaException("Reserva finalizada não pode ser cancelada");
       }

       this.status = StatusReserva.CANCELADA;
       quarto.marcarDisponivel();
   }
}
