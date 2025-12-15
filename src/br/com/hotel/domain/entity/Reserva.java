package br.com.hotel.domain.entity;

import java.time.LocalDate;
import java.util.UUID;

public class Reserva {

    private UUID id;
    private Cliente cliente;
    private Quarto quarto;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private String status;

}
