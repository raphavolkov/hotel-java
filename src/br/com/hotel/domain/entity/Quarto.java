package br.com.hotel.domain.entity;

import br.com.hotel.domain.entity.exceptions.QuartoComCapacidadeInvalidaException;
import br.com.hotel.domain.entity.exceptions.QuartoNumeroEObrigatorioException;
import br.com.hotel.domain.entity.exceptions.QuartoTipoEObrigatorioException;
import br.com.hotel.domain.entity.exceptions.QuartoValorDiariaInvalidaException;
import br.com.hotel.domain.enums.TipoQuarto;

import java.util.UUID;

public class Quarto {

    private final UUID id;
    private final String numero;
    private final TipoQuarto tipo;
    private final int capacidade;
    private final double valorDiaria;
    private boolean disponivel;

    public Quarto(String numero, TipoQuarto tipo, int capacidade, double valorDiaria) {
        if(capacidade <= 0) {
            throw new QuartoComCapacidadeInvalidaException();
        }

        if(valorDiaria < 0) {
            throw new QuartoValorDiariaInvalidaException();
        }

        if (numero == null || numero.isBlank()) {
            throw new QuartoNumeroEObrigatorioException();
        }

        if (tipo == null) {
            throw new QuartoTipoEObrigatorioException();
        }
        this.id = UUID.randomUUID();
        this.numero = numero;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.valorDiaria = valorDiaria;
        this.disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void marcarIndisponivel(){
        this.disponivel = false;
    }

    public void marcarDisponivel(){
        this.disponivel = true;
    }

    public UUID getId() {
        return id;
    }
    public String getNumero() {
        return numero;
    }
    public TipoQuarto getTipo() {
        return tipo;
    }
}
