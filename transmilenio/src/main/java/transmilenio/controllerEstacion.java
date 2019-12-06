package transmilenio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Bean.Estacion;
import Bean.Troncal;

@RestController
@Controller
public class controllerEstacion {
	
@Autowired
EstacionRepository estacionRepository;
	
	 @GetMapping("/Estacion")
	 public List<Estacion> getAllEstaciones() {
	     return   (List<Estacion>) estacionRepository.findAll();
	     
	 }
	 
	 @PostMapping("/Estacion/Insert")
	 public ResponseEntity<Estacion> addTroncal(@RequestBody Estacion troncal) {
		estacionRepository.save(troncal);
		 return new ResponseEntity<Estacion>( troncal , HttpStatus.OK);
	 }
	 
	 //@PutMapping("/Estacion/{id}")
	 /* public ResponseEntity<Estacion> updateTroncal(@RequestBody Estacion estacionDetail ,@PathVariable String id ) {
		 
		 
		 /* return estacionRepository.findById(id).map(troncalDetail-> {
			 troncalDetail.setCodEstacion(estacionDetail.getCodEstacion());
			 troncalDetail.setEstado(estacionDetail.getEstado());
			 }
		 );
		  {
			  List<Estacion> troncal = (List<Estacion>) estacionRepository.findAll();
			 
			 if (troncal.contains(estacionDe)  ) {
				 return new ResponseEntity<>(estacionDe, HttpStatus.OK);
			}else {
				return new ResponseEntity<Estacion>( estacionDe,HttpStatus.BAD_REQUEST);
			}
			 
		}*/
}

