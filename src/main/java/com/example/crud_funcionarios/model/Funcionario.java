package com.example.crud_funcionarios.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_funcionario")
@Data
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 100)
    private String nome;

    @Column(name = "cargo", length = 50)
    private String cargo;

    @Column(name = "departamento", length = 50)
    private String departamento;

    @Column(name = "data_admissao")
    private LocalDate dataAdmissao;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "telefone", length = 20)
    private String telefone;
}
