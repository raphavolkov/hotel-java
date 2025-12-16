package br.com.hotel.application.usecase;

import br.com.hotel.domain.entity.Cliente;
import br.com.hotel.domain.entity.Quarto;
import br.com.hotel.domain.entity.Reserva;
import br.com.hotel.domain.repository.ClienteRepository;
import br.com.hotel.domain.repository.QuartoRepository;
import br.com.hotel.domain.repository.ReservaRepository;
import br.com.hotel.domain.valueobject.Periodo;

import java.util.UUID;

public class CriarReservaUseCase {

    private final ClienteRepository clienteRepository;
    private final QuartoRepository quartoRepository;
    private final ReservaRepository reservaRepository;

    public CriarReservaUseCase(
            ClienteRepository clienteRepository,
            QuartoRepository quartoRepository,
            ReservaRepository reservaRepository)
    {
        this.clienteRepository = clienteRepository;
        this.quartoRepository = quartoRepository;
        this.reservaRepository = reservaRepository;
    }

    public Reserva executar(UUID clienteId, UUID quartoId, Periodo periodo) {

        Cliente cliente = clienteRepository.findById(clienteId)
                .orElseThrow(() -> new IllegalStateException("Cliente não encontrado"));

        Quarto quarto = quartoRepository.findById(quartoId)
                .orElseThrow(() -> new IllegalStateException("Quarto não encontrado"));

        Reserva reserva = new Reserva(cliente, quarto, periodo);

        reserva.confirmar();

        reservaRepository.save(reserva);

        return reserva;
    }
}
