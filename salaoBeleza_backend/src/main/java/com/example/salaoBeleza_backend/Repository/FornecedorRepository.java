package com.example.salaoBeleza_backend.Repository;

import com.example.salaoBeleza_backend.Model.Cliente;
import com.example.salaoBeleza_backend.Model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

    // Método para encontrar um fornecedor pelo CPF ou CNPJ
    Optional<Fornecedor> findByCpfOuCnpj(String cpfOuCnpj);

    // Verifica se já existe um fornecedor com o CPF ou CNPJ fornecido
    boolean existsByCpfOuCnpj(String cpfOuCnpj);

    // Método para encontrar um fornecedor pelo email
    Optional<Fornecedor> findByEmail(String email);

    // Verifica se já existe um fornecedor com o email fornecido
    boolean existsByEmail(String email);

    // Método para encontrar todos os fornecedores
    List<Fornecedor> findAll();

    // Método para encontrar um fornecedor pelo nome
    Optional<Fornecedor> findByNome(String nome);

    // Verifica se já existe um fornecedor com o nome fornecido
    boolean existsByNome(String nome);

    // Método para excluir um fornecedor pelo ID
    void deleteById(Long id);

    // Método para excluir um fornecedor pelo CPF ou CNPJ
    void deleteByCpfOuCnpj(String cpfOuCnpj);

    // Método para excluir um fornecedor pelo email
    void deleteByEmail(String email);
}
