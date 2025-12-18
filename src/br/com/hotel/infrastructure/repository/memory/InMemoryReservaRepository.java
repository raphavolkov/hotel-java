package br.com.hotel.infrastructure.repository.memory;

import br.com.hotel.domain.entity.Reserva;
import br.com.hotel.domain.repository.ReservaRepository;

import java.util.*;

public class InMemoryReservaRepository implements ReservaRepository {

    private final Map<UUID, Reserva> storage = new HashMap<>();

    @Override
    public void save(Reserva reserva) {
        storage.put(reserva.getId(), reserva);
    }

    @Override
    public List<Reserva> findByQuartoId(UUID quartoId) {
        return storage.values().stream()
                .filter(r -> r.getQuartoId().equals(quartoId))
                .toList();
    }

    @Override
    public Optional<Reserva> findById(UUID id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Reserva> findAll() {
        return new ArrayList<>(storage.values());
    }
}
