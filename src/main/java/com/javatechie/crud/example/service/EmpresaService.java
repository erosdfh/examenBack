package com.javatechie.crud.example.service;

import com.javatechie.crud.example.entity.Empresa;
import com.javatechie.crud.example.repository.EmpresaRepository;

import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

@Service
public class EmpresaService {
    @Autowired
    private EmpresaRepository repository;
    private static final String QUERY_BUSCA_MENSAJES = "select * from empresa ORDER BY id_empresa DESC LIMIT 3";
    public Empresa saveSucursal(Empresa product) {
    	
    	if (product.getId_empresa()==null) {
            
		}else {
			
			Empresa existingProduct = repository.findById(product.getId_empresa()).orElse(null);
            existingProduct.setRuc(product.getRuc());
            existingProduct.setRazonSocial(product.getRazonSocial());
            existingProduct.setDireccion(product.getDireccion());
            existingProduct.setEstado(product.getEstado());
		    return repository.save(product);
		}
    	
        return repository.save(product);
    }

    public List<Empresa> saveSucursals(List<Empresa> products) {
        return repository.saveAll(products);
    }

    public List<Empresa> getSucursal() {
        
      return repository.findAll();
    }
    /*public List<Empresa> getSucursal(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mensajes");
        EntityManager em = emf.createEntityManager();
    
        Query query = em.createQuery(QUERY_BUSCA_MENSAJES);
    
        List<Empresa> mensajes = query.getResultList();
    
        // em.getTransaction().commit();
        em.close();
        emf.close();

        return mensajes;
      }*/
    public Empresa getSucursalById(int id) {
        return repository.findById(id).orElse(null);
    }

 


}
