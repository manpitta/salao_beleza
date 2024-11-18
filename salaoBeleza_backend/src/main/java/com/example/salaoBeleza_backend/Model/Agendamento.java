package com.example.salaoBeleza_backend.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgendamento;

    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = false)
    @NotNull(message = "O cliente é obrigatório.")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idServico", nullable = false)
    @NotNull(message = "O serviço é obrigatório.")
    private Servico servico;

    @NotNull(message = "A data do agendamento é obrigatória.")
    private LocalDate data;

    @NotNull(message = "A hora do agendamento é obrigatória.")
    private LocalTime hora;

    @Enumerated(EnumType.STRING) // Armazena o nome do Enum como String no banco de dados.
    @NotNull(message = "O status do agendamento é obrigatório.")
    private StatusAgendamento statusAgendamento;
}
