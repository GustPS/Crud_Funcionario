package com.example.crud_funcionarios.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.NotFound;

import java.util.Date;

@Entity
@Table(name = "tbl_funcionario")
@Data
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotFound
    @Column(name = "nome", length = 100)
    private String nome;

    @NotFound
    @Column(name = "cargo", length = 50)
    private String cargo;

    @NotFound
    @Column(name = "departamento", length = 50)
    private String departamento;

    @NotFound
    @Column(name = "data_admissao")
    private Date dataAdmissao;

    @NotFound
    @Column(name = "email", length = 100)
    private String email;

    @NotFound
    @Column(name = "telefone", length = 20)
    private String telefone;
}
