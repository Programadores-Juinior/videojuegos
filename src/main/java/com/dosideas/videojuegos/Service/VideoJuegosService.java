package com.dosideas.videojuegos.Service;

import com.dosideas.videojuegos.domain.videojuego;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class VideoJuegosService {

    public List<videojuego> buscarDestacados() {
        List<videojuego> destacados = new ArrayList<>();

        videojuego juego = new videojuego();
        juego.setNombre("Borderlands 3");
        juego.setDescripcion("En stock");
        juego.setImagenUrl("https://store-images.s-microsoft.com/image/apps.29324.71029176982638972.07f274c3-060d-4786-b7b2-69156454002c.8b96fcc3-c9bd-4c79-a956-a9bd3ef02895");
        destacados.add(juego);

        juego = new videojuego();
        juego.setNombre("Call of Duty MW");
        juego.setDescripcion("En stock");
        juego.setImagenUrl("https://store-images.s-microsoft.com/image/apps.50528.68332208580498659.9222b095-8101-4531-b386-33547ee9944f.948f2c50-2f29-43df-9557-4670f69840d1");
        destacados.add(juego);

        juego = new videojuego();
        juego.setNombre("Assassin'S Creed ODYSSEY");
        juego.setDescripcion("En stock");
        juego.setImagenUrl("https://1.bp.blogspot.com/-amzy02Z6PkE/XlN6BylPFkI/AAAAAAAAGhg/I34VBr0KTB4nu36ZFtEgthj92KDb2or2gCLcBGAsYHQ/s1600/512706-assassin-s-creed-odyssey-gold-edition-xbox-one-front-cover.jpg");
        destacados.add(juego);

        juego = new videojuego();
        juego.setNombre("Star Wars BATTLEFRONTT II");
        juego.setDescripcion("En stock");
        juego.setImagenUrl("https://store-images.s-microsoft.com/image/apps.31281.64256825846959382.44b5bc43-437a-4414-83ca-b41ba9e7764a.86abb8aa-f419-4a90-b6aa-cf79b4228f06");
        destacados.add(juego);

        return destacados;
    }


}
