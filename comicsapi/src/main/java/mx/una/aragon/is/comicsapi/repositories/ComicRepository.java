package mx.una.aragon.is.comicsapi.repositories;

import mx.una.aragon.is.comicsapi.entities.Comic;
import org.springframework.data.repository.CrudRepository;

public interface ComicRepository extends CrudRepository<Comic, Integer> {
    //public Comic findComicByClave(Long clave);
    //public Comic deleteByClave(Long clave);
}
