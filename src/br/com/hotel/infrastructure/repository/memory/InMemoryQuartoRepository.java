package br.com.hotel.infrastructure.repository.memory;

import br.com.hotel.domain.entity.Quarto;
import br.com.hotel.domain.enums.TipoQuarto;
import br.com.hotel.domain.repository.QuartoRepository;

import java.util.*;

public class InMemoryQuartoRepository implements QuartoRepository {

    private final Map<UUID, Quarto> storage = new HashMap<>();

    @Override
    public void save(Quarto quarto) {
        storage.put(quarto.getId(), quarto);
    }

    @Override
    public Optional<Quarto> findById(UUID id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Quarto> findDisponiveis(){
        return storage.values().stream()
                .filter(Quarto::isDisponivel)
                .toList();
    }

    @Override
    public Optional<Quarto> findByNumero(String numero) {
        return storage.values().stream()
                .filter(q -> q.getNumero().equals(numero))
                .findFirst();
    }

    @Override
    public List<Quarto> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public List<Quarto> findPorTipo(TipoQuarto tipo) {
        return storage.values().stream()
                .filter(q -> q.getTipo().equals(tipo))
                .toList();
    }
}
