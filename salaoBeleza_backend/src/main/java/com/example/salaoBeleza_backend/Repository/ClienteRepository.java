package com.example.salaoBeleza_backend.Repository;

import com.example.salaoBeleza_backend.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    // Método para encontrar um cliente pelo CPF
    Optional<Cliente> findByCpf(String cpf);

    // Verifica se já existe um cliente com o CPF fornecido
    boolean existsByCpf(String cpf);

    // Método para encontrar um cliente pelo email
    Optional<Cliente> findByEmail(String email);

    // Verifica se já existe um cliente com o email fornecido
    boolean existsByEmail(String email);

    // Método para encontrar todos os clientes
    List<Cliente> findAll();

    // Método para encontrar um cliente pelo nome
    Optional<Cliente> findByNome(String nome);

    // Verifica se já existe um cliente com o nome fornecido
    boolean existsByNome(String nome);

    // Método para excluir um cliente pelo ID
    void deleteById(Long id);

    // Método para excluir um cliente pelo email
    void deleteByEmail(String email);

    // Método para excluir um cliente pelo CPF
    void deleteByCpf(String cpf);
}
