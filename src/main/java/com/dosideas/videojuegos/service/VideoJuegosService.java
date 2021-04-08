package com.dosideas.videojuegos.service;

import com.dosideas.videojuegos.domain.Videojuego;
import com.dosideas.videojuegos.repository.VideojuegoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VideoJuegosService {

    private final VideojuegoRepository videojuegoRepository;

    public VideoJuegosService(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }

    public List<Videojuego> buscarDestacados() {
        return videojuegoRepository.buscarTodos();
    }

    public List<Videojuego> buscarPorDistribuidor(int distribuidorId){
        return videojuegoRepository.buscarPorDistribuidor(distribuidorId);
    }

}
