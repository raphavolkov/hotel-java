package br.com.hotel.domain.repository;

import br.com.hotel.domain.entity.Quarto;
import br.com.hotel.domain.entity.Reserva;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ReservaRepository {

    void save(Reserva reserva);

    Optional<Reserva> findById(UUID id);

    List<Reserva> findByQuarto(Quarto quarto);

    List<Reserva> findByQuartoId(UUID quartoId);

    List<Reserva> findAll();
}
