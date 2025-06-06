package mx.una.aragon.is.comicsapi.services;

import mx.una.aragon.is.comicsapi.dtos.ComicUpdateDto;
import mx.una.aragon.is.comicsapi.entities.Comic;
import mx.una.aragon.is.comicsapi.mappers.ComicMapper;
import mx.una.aragon.is.comicsapi.repositories.ComicRepository;
import mx.una.aragon.is.comicsapi.services.interfaces.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ComicServiceImpl implements ComicService {
    @Autowired
    private final ComicRepository comicRepository;
    private final ComicMapper comicMapper;

    public ComicServiceImpl(ComicRepository comicRepository, ComicMapper comicMapper) {
        this.comicRepository = comicRepository;
        this.comicMapper = comicMapper;
    }

    @Override
    public Comic crear(Comic comic) {
        return comicRepository.save(comic);
    }

    @Override
    public Iterable<Comic> listarTodas() {
        return comicRepository.findAll();
    }

    @Override
    public Comic buscarPorId(Integer clave) {
        return comicRepository.findById(clave).orElse(null);
    }

    @Override
    public Comic actualizar(Integer clave, Comic comic) {
        Optional<Comic> comicActual = comicRepository.findById(clave);
        if (comicActual.isPresent()) {
            Comic tmp = comicActual.get();
            tmp.setTitulo(comic.getTitulo());
            tmp.setEditorial(comic.getEditorial());
            tmp.setNumeroEdicion(comic.getNumeroEdicion());
            tmp.setPrecio(comic.getPrecio());
            tmp.setImagen(comic.getImagen());
            return comicRepository.save(tmp);
        } else {
            return null;
        }
    }

    @Override
    public Comic actualizarParcialComic(Integer clave, ComicUpdateDto dto) {
        Comic comic = comicRepository.findById(clave)
                .orElseThrow(() -> new RuntimeException("Comic no encontrado, no existe creo"));
        comicMapper.updateComicFromDto(dto, comic);
        return comicRepository.save(comic);
    }

    @Override
    public Comic eliminarComic(Integer clave) {
        Comic comic = comicRepository.findById(clave).orElseThrow(() -> new RuntimeException("Comic no encontrado con ID: " + clave));
        comicRepository.deleteById(clave);
        return comic;
    }
}
