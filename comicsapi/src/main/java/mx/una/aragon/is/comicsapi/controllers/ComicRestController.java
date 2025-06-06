package mx.una.aragon.is.comicsapi.controllers;

import mx.una.aragon.is.comicsapi.dtos.ComicUpdateDto;
import mx.una.aragon.is.comicsapi.entities.Comic;
import mx.una.aragon.is.comicsapi.services.interfaces.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/comics")
public class ComicRestController {

    @Autowired
    private ComicService comicService;

    private static String URI_LOCAL = "http://localhost:8080";

    //get all o todos
    @GetMapping("/")
    public ResponseEntity<Iterable<Comic>> getComics() {
        return new ResponseEntity<>(comicService.listarTodas(), HttpStatus.OK);
    }

    //solo uno
    @GetMapping("/{id}")
    public ResponseEntity<Comic> getComic(@PathVariable Integer id) {
        return new ResponseEntity<>(comicService.buscarPorId(id), HttpStatus.OK);
    }


    //crear comic
    @PostMapping("/")
    public ResponseEntity<Comic> createComic(@RequestBody Comic comic) throws URISyntaxException {
        return new ResponseEntity<>(comicService.crear(comic), HttpStatus.OK);
    }


    //modificar un comic 9mandar todos los parametros)
    @PutMapping("/{id}")
    public ResponseEntity<Comic> updateComic(@PathVariable Integer id, @RequestBody Comic comic) {
        return new ResponseEntity<>(comicService.actualizar(id, comic), HttpStatus.OK);
    }

    //modificar soloo una parte deseada
    @PatchMapping("/{id}")
    public ResponseEntity<Comic> patchComic(@PathVariable Integer id, @RequestBody ComicUpdateDto comic) {
        return new ResponseEntity<>(comicService.actualizarParcialComic(id, comic), HttpStatus.OK);
    }


    //eliminar por id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteComic(@PathVariable Integer id) {
        comicService.eliminarComic(id);
        return null;
    }
}
