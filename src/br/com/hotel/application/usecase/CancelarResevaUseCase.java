package br.com.hotel.application.usecase;

import br.com.hotel.domain.entity.Reserva;
import br.com.hotel.domain.repository.ReservaRepository;

import java.util.UUID;

public class CancelarResevaUseCase {

    private final ReservaRepository reservaRepository;

    public CancelarResevaUseCase(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public void executar(UUID reservaId){

        Reserva reserva = reservaRepository.findById(reservaId)
                .orElseThrow(() -> new IllegalStateException("Reserva não eonctrada"));

        reserva.cancelar();

        reservaRepository.save(reserva);
    }
}
