package com.example.salaoBeleza_backend.Repository;

import com.example.salaoBeleza_backend.Model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long> {

    // Método para encontrar um serviço pelo nome
    Optional<Servico> findByNome(String nome);

    // Verifica se já existe um serviço com o nome fornecido
    boolean existsByNome(String nome);

    // Método para excluir um serviço pelo nome
    void deleteByNome(String nome);

    // Método para excluir um serviço pelo ID
    void deleteById(Long id);
}
