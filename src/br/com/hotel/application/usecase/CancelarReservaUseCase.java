package br.com.hotel.application.usecase;

import br.com.hotel.application.exceptions.CancelarResevaNaoEncontradaException;
import br.com.hotel.domain.entity.Reserva;
import br.com.hotel.domain.repository.ReservaRepository;

import java.util.UUID;

public class CancelarReservaUseCase {

    private final ReservaRepository reservaRepository;

    public CancelarReservaUseCase(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public void executar(UUID reservaId){

        Reserva reserva = reservaRepository.findById(reservaId)
                .orElseThrow(CancelarResevaNaoEncontradaException::new);

        reserva.cancelar();

        reservaRepository.save(reserva);
    }
}
