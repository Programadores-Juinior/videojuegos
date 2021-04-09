package com.dosideas.videojuegos.controller;

import com.dosideas.videojuegos.domain.Videojuego;
import com.dosideas.videojuegos.service.DistribuidorService;
import com.dosideas.videojuegos.service.VideoJuegosService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideojuegoABMcontroller {

    private final DistribuidorService distribuidorService;
    private final VideoJuegosService videoJuegosService;

    public VideojuegoABMcontroller(DistribuidorService distribuidorService, VideoJuegosService videoJuegosService) {
        this.distribuidorService = distribuidorService;
        this.videoJuegosService = videoJuegosService;
    }


    @RequestMapping("/videojuegos/crear")
    public String mostrarFormAlta(Model model){
        model.addAttribute("distribuidores",distribuidorService.buscarTodos());
        model.addAttribute("videojuego", new Videojuego());
        return "formVideojuego";
    }

    @PostMapping("/videojuegos/guardar")
    public String guardar (Videojuego videojuego){
        videoJuegosService.guardar(videojuego);
        return "redirect:/";
    }

}
