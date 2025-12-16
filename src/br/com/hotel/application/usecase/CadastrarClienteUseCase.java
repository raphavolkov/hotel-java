package br.com.hotel.application.usecase;

import br.com.hotel.domain.entity.Cliente;
import br.com.hotel.domain.repository.ClienteRepository;
import br.com.hotel.domain.valueobject.Documento;
import br.com.hotel.domain.valueobject.Email;

public class CadastrarClienteUseCase {

    private final ClienteRepository clienteRepository;

    public CadastrarClienteUseCase(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente executar(String nome, Documento documento, Email email, String telefone) {

        clienteRepository.findByDocumento(documento)
                .ifPresent(c -> {
                    throw new IllegalStateException("Cliente já cadastrado com este documento");
                });

        Cliente cliente = new Cliente(nome, documento, email, telefone);

        clienteRepository.save(cliente);

        return cliente;
    }
}
