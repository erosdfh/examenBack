package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.entity.Empresa;
import com.javatechie.crud.example.service.EmpresaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {

    @Autowired
    private EmpresaService service;

    @PostMapping("/addEmpresa")
    public Empresa addSucursal(@RequestBody Empresa product) {
        return service.saveSucursal(product);
    }

    @PostMapping("/addEmpresas")
    public List<Empresa> addUSucursales(@RequestBody List<Empresa> products) {
        return service.saveSucursals(products);
    }

    @GetMapping("/empresas")
    public List<Empresa> findAllSucursales() {
        return service.getSucursal();
    }

    @GetMapping("/empresaById/{id}")
    public Empresa findSucursalById(@PathVariable int id) {
        return service.getSucursalById(id);
    }

 
  
}
