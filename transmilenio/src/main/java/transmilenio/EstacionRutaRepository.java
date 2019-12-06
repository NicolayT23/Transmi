package transmilenio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import Bean.Estacion;
import Bean.EstacionRuta;

@Service
public interface EstacionRutaRepository extends CrudRepository<EstacionRuta, String> {

}
