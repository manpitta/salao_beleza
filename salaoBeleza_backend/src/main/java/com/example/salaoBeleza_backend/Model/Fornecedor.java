package com.example.salaoBeleza_backend.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.security.Provider;
import java.util.List;

@Entity
@Table(name = "fornecedores")
@Data

public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFornecedor;

    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres")
    private String nome;

    @NotBlank(message = "CPF ou CNPJ é obrigatório")
    @Pattern(
            regexp = "\\d{11}|\\d{14}",
            message = "O CPF deve conter 11 dígitos ou o CNPJ deve conter 14 dígitos"
    )
    @Column(unique = true)
    private String cpfOuCnpj;

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

    public String getCpfOuCnpj() { return cpfOuCnpj; }

    public void setCpfOuCnpj(String cpfOuCnpj) { this.cpfOuCnpj = cpfOuCnpj; }

    public List<Servico> getListaDeServicos() {
        return listaDeServicos;
    }

    public void setListaDeServicos(List<Servico> listaDeServicos) {
        this.listaDeServicos = listaDeServicos;
    }
}
