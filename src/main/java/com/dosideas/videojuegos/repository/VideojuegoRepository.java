package com.dosideas.videojuegos.repository;

import com.dosideas.videojuegos.domain.videojuego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideojuegoRepository extends JpaRepository<videojuego,Integer> {
    
}
