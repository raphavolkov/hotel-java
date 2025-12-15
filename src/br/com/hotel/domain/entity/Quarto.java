package br.com.hotel.domain.entity;

import br.com.hotel.domain.entity.exceptions.QuartoInvalidoException;
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
            throw new QuartoInvalidoException("Capacidade Invalida");
        }

        if(valorDiaria < 0) {
            throw new QuartoInvalidoException("Valor diaria Invalida");
        }

        if (numero == null || numero.isBlank()) {
            throw new QuartoInvalidoException("Número do quarto é obrigatório");
        }

        if (tipo == null) {
            throw new QuartoInvalidoException("Tipo do quarto é obrigatório");
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

}
