package transmilenio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import Bean.EstacionRuta;

@RestController
@Controller
public class ControllerEstacionRuta {

	
	@Autowired
	EstacionRutaRepository EstacionRutaRepo;
	
	 @GetMapping("/EstacionRuta")
	 public List<EstacionRuta> getAllEstaciones() {
	     return (List<EstacionRuta>) EstacionRutaRepo.findAll();
	     
	 }
	 
	 
	 @PostMapping("/Estacion/Insert")
	 public ResponseEntity<EstacionRuta> addTroncal(@RequestBody EstacionRuta EstaRuta) {
		 EstacionRutaRepo.save(EstaRuta);
		 return new ResponseEntity<EstacionRuta>( EstaRuta , HttpStatus.OK);
	 }
}
