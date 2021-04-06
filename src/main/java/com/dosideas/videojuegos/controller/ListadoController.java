package com.dosideas.videojuegos.controller;

import com.dosideas.videojuegos.Service.VideoJuegosService;
import com.dosideas.videojuegos.domain.videojuego;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class ListadoController {

    private final VideoJuegosService videoJuegosService;


    public ListadoController(VideoJuegosService videoJuegosService) {
        this.videoJuegosService = videoJuegosService;
    }

    @RequestMapping("/")
    public  String listarVideojuegos(Model model){
        //busqueda de los videojuegos
        List<videojuego> destacados = videoJuegosService.buscarDestacados();
        model.addAttribute("videojuego",destacados);
        return "Listado";
    }

}
