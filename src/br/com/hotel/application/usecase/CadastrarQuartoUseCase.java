package br.com.hotel.application.usecase;

import br.com.hotel.domain.entity.Quarto;
import br.com.hotel.domain.enums.TipoQuarto;
import br.com.hotel.domain.repository.QuartoRepository;

public class CadastrarQuartoUseCase {

    private final QuartoRepository quartoRepository;

    public CadastrarQuartoUseCase(QuartoRepository quartoRepository) {
        this.quartoRepository = quartoRepository;
    }

    public Quarto executar(String numero, TipoQuarto tipo, int capacidade, double valorDiaria){

        quartoRepository.findByNumero(numero)
                .ifPresent(q -> {
                    throw new IllegalStateException("Já existe um quarto com esse numero");
                });

        Quarto quarto = new Quarto(numero, tipo, capacidade, valorDiaria);

        quartoRepository.save(quarto);

        return quarto;
    }
}
