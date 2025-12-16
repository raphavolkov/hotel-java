package br.com.hotel.domain.repository;

import br.com.hotel.domain.entity.Cliente;
import br.com.hotel.domain.valueobject.Documento;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClienteRepository {

    void save(Cliente cliente);

    Optional<Cliente> findById(UUID id);

    Optional<Cliente> findByDocumento(Documento documento);

    List<Cliente> findAll();
}
