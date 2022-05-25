package com.javatechie.crud.example.repository;

import com.javatechie.crud.example.entity.Empresa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa,Integer> {
    
}

