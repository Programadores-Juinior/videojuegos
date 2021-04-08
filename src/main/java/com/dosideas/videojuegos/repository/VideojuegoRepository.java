package com.dosideas.videojuegos.repository;

import com.dosideas.videojuegos.domain.Videojuego;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface VideojuegoRepository extends JpaRepository<Videojuego,Integer> {

    // Busca por orden alfabetico
    @Query ("from Videojuego v order by v.nombre")
    List<Videojuego> buscarTodos();

    // Busca por distribuidor y los muestra en orden alfabetico
    @Query ("from Videojuego v where v.distribuidor.id =?1 order by v.nombre")
    List<Videojuego> buscarPorDistribuidor(int distribuidorId);

    //CREA UN BUSCADOR, BUSCA JUEGOS QUE CONTENGAN LAS LETRAS QUE UNO INTRODUSCA
   // @Query ("from Videojuego v where v.nombre like %?1%")
    List<Videojuego> findByNombreContaining (String consulta);
    
}
