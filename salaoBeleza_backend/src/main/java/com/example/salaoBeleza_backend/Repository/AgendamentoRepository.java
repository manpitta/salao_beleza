package com.example.salaoBeleza_backend.Repository;

import com.example.salaoBeleza_backend.Model.Agendamento;
import com.example.salaoBeleza_backend.Model.StatusAgendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

    // Método para encontrar agendamentos por cliente
    List<Agendamento> findByClienteId(Long idCliente);

    // Método para encontrar agendamentos por status
    List<Agendamento> findByStatusAgendamento(StatusAgendamento statusAgendamento);

    // Método para encontrar agendamentos por data
    List<Agendamento> findByData(LocalDate data);

    // Método para encontrar agendamentos por data e hora
    Optional<Agendamento> findByDataAndHora(LocalDate data, LocalTime hora);

    // Método para verificar se existe agendamento para um cliente e status específico
    boolean existsByClienteIdAndStatusAgendamento(Long idCliente, StatusAgendamento statusAgendamento);

    // Método para listar todos os agendamentos
    List<Agendamento> findAll();
}
