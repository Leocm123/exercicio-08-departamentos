package com.exercicios.crud.service;

import com.exercicios.crud.entity.Departamento;
import com.exercicios.crud.repository.DepartamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    private final DepartamentoRepository departamentoRepository;

    public DepartamentoService(DepartamentoRepository departamentoRepository) {
        this.departamentoRepository = departamentoRepository;
    }

    public Departamento salvar(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    public List<Departamento> listarTodos() {
        return departamentoRepository.findAll();
    }

    public Optional<Departamento> buscarPorId(Long id) {
        return departamentoRepository.findById(id);
    }

    public void deletar(Long id) {
        departamentoRepository.deleteById(id);
    }
}