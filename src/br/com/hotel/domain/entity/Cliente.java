package br.com.hotel.domain.entity;

import br.com.hotel.domain.entity.exceptions.ClienteComDocumentoEEmailObrigatoriosException;
import br.com.hotel.domain.entity.exceptions.ClienteComNomeObrigatorioException;
import br.com.hotel.domain.entity.exceptions.ClienteEmailNaoPodeSerNuloException;
import br.com.hotel.domain.valueobject.Documento;
import br.com.hotel.domain.valueobject.Email;

import java.util.UUID;

public class Cliente {

    private final UUID id;
    private String nome;
    private final Documento documento;
    private Email email;
    private String telefone;

    public Cliente(String nome, Documento documento, Email email, String telefone){
        if(nome == null || nome.isBlank()) {
            throw new ClienteComNomeObrigatorioException();
        }

        if (documento == null || email == null) {
            throw new ClienteComDocumentoEEmailObrigatoriosException();
        }

        this.id = UUID.randomUUID();
        this.nome = nome;
        this.documento = documento;
        this.email = email;
        this.telefone = telefone;
    }

    public UUID getId() {return id;}
    public Documento getDocumento() {return documento;}
    public Email getEmail() {return email;}

    public void atualizarEmail(Email novoEmail){
        if (novoEmail == null) {
            throw new ClienteEmailNaoPodeSerNuloException();
        }

        this.email = novoEmail;
    }
}
