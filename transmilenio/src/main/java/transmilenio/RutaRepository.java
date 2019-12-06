package transmilenio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import Bean.Ruta;


		@Service
	public interface RutaRepository extends CrudRepository<Ruta, String> {

	}


