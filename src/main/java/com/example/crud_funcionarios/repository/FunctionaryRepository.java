package com.example.crud_funcionarios.repository;


import com.example.crud_funcionarios.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FunctionaryRepository extends JpaRepository<Funcionario, Long> {
}
