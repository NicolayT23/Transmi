package transmilenio;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import Bean.Troncal;



@Service
public interface TroncalRepository extends CrudRepository<Troncal , String> {

}
