package transmilenio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import Bean.Estacion;


@Service
public interface EstacionRepository extends CrudRepository<Estacion, String> {

}