package br.com.hotel.infrastructure.repository.memory;

import br.com.hotel.domain.entity.Cliente;
import br.com.hotel.domain.repository.ClienteRepository;
import br.com.hotel.domain.valueobject.Documento;

import java.util.*;

public class InMemoryClienteRepository implements ClienteRepository {

    private final Map<UUID, Cliente> storage = new HashMap<>();

    @Override
    public void save(Cliente cliente) {
        storage.put(cliente.getId(), cliente);
    }

    @Override
    public Optional<Cliente> findById(UUID id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public Optional<Cliente> findByDocumento(Documento documento) {
        return storage.values().stream()
                .filter(c -> c.getDocumento().equals(documento))
                .findFirst();
    }

    @Override
    public List<Cliente>  findAll() {
        return new ArrayList<>(storage.values());
    }
}
