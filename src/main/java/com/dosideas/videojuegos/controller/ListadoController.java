package com.dosideas.videojuegos.controller;

import com.dosideas.videojuegos.service.VideoJuegosService;
import com.dosideas.videojuegos.domain.Videojuego;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        List<Videojuego> destacados = videoJuegosService.buscarDestacados();
        model.addAttribute("videojuego",destacados);
        return "Listado";
    }

    @RequestMapping("/videojuegosPorDistribuidor")
    public String listarVideojuegosPorDistribuidor(int distribuidorId ,Model model){
    List<Videojuego> juegos = videoJuegosService.buscarPorDistribuidor(distribuidorId);
    model.addAttribute("videojuego",juegos);
    return "Listado";
    }

    @RequestMapping("/buscar")
    public String buscar(@RequestParam ("q") String consulta , Model model){
        List<Videojuego> juegos = videoJuegosService.buscar(consulta);
        model.addAttribute("videojuego",juegos);
        return "Listado";
    }

}
