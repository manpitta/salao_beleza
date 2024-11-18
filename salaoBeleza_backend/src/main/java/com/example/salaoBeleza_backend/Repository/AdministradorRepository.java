package com.example.salaoBeleza_backend.Repository;

import com.example.salaoBeleza_backend.Model.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Long> {

    // Método para encontrar um administrador pelo e-mail
    Optional<Administrador> findByEmail(String email);

    // Verifica se já existe um administrador com o e-mail fornecido
    boolean existsByEmail(String email);

    // Método para encontrar um administrador pelo CPF
    Optional<Administrador> findByCpf(String cpf);

    // Verifica se já existe um administrador com o CPF fornecido
    boolean existsByCpf(String cpf);
}
