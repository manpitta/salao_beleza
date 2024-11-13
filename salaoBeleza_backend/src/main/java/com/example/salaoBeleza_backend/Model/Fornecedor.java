package com.example.salaoBeleza_backend.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.security.Provider;
import java.util.List;

@Entity
@Table(name = "fornecedores")
@Data

public class Fornecedor {

    @Id // indica que o campo é o id da entidade cliente
    @GeneratedValue(strategy = GenerationType.IDENTITY) // para garantir que o id seja gerado automaticamente para cada cliente
    private Long idFornecedor;

    @NotBlank(message = "O nome é obrigatório") // para garantir que um campo de texto (String) não seja nulo nem esteja vazio
    @Size(min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres") // verifica o comprimento do valor
    private String nome;

    @Email(message = "Email deve ser válido") // para validar se um campo contém um endereço de e-mail válido
    @NotBlank(message = "O email é obrigatório")
    private String email;

    @NotBlank(message = "A senha é obrigatória")
    @Size(min = 6, message = "A senha deve ter no mínimo 6 caracteres")
    private String senha;

    @OneToMany(mappedBy = "fornecedores")
    private List<Servico> listaDeServicos;

    public Long getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Long idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Servico> getListaDeServicos() {
        return listaDeServicos;
    }

    public void setListaDeServicos(List<Servico> listaDeServicos) {
        this.listaDeServicos = listaDeServicos;
    }
}
