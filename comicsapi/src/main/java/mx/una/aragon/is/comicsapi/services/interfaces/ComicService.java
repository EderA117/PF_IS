package mx.una.aragon.is.comicsapi.services.interfaces;

import mx.una.aragon.is.comicsapi.dtos.ComicUpdateDto;
import mx.una.aragon.is.comicsapi.entities.Comic;

import java.util.Optional;

public interface ComicService {
    public abstract Comic crear(Comic comic);

    public abstract Iterable<Comic> listarTodas();

    public abstract Comic buscarPorId(Integer clave);

    Comic actualizar(Integer clave, Comic comic);

    Comic actualizarParcialComic(Integer clave, ComicUpdateDto dto);

    Comic eliminarComic(Integer clave);
}
