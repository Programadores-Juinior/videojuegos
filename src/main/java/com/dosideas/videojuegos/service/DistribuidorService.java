package com.dosideas.videojuegos.service;

import com.dosideas.videojuegos.domain.Distribuidor;
import com.dosideas.videojuegos.domain.Videojuego;
import com.dosideas.videojuegos.repository.DistribuidorRepository;
import com.dosideas.videojuegos.repository.VideojuegoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DistribuidorService {

    public DistribuidorService(DistribuidorRepository distribuidorRepository) {
        this.distribuidorRepository = distribuidorRepository;
    }

    private final DistribuidorRepository distribuidorRepository;

    public List<Distribuidor> buscarTodos(){
        return distribuidorRepository.findAll();
    }




}
