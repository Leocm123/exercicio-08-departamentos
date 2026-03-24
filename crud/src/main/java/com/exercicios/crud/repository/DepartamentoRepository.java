package com.exercicios.crud.repository;

import com.exercicios.crud.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}