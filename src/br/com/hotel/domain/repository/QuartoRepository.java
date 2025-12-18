package br.com.hotel.domain.repository;

import br.com.hotel.domain.entity.Quarto;
import br.com.hotel.domain.enums.TipoQuarto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface QuartoRepository {

    void save(Quarto quarto);

    Optional<Quarto> findById(UUID id);

    Optional<Quarto> findByNumero(String numero);

    List<Quarto> findAll();

    List<Quarto> findPorTipo(TipoQuarto tipo);

    List<Quarto> findDisponiveis();
}
