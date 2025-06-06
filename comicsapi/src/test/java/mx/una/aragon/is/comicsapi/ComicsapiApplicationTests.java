package mx.una.aragon.is.comicsapi;

import mx.una.aragon.is.comicsapi.entities.Comic;
import mx.una.aragon.is.comicsapi.repositories.ComicRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComicsapiApplicationTests {

	@Autowired
	private ComicRepository comicRepository;

	@Test
	void contextLoads() {
		// Verifica que el contexto de Spring arranque sin problemas
	}

}
