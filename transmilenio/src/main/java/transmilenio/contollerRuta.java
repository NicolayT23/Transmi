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
import Bean.Ruta;
import Bean.Troncal;

@RestController
@Controller
public class contollerRuta {
	
@Autowired
RutaRepository rutaRepository;
	
	 @GetMapping("/ruta")
	 public List<Ruta> getAllRutas() {
	     return   (List<Ruta>) rutaRepository.findAll();
	     
	 }
	 
	 @PostMapping("/ruta/Insert")
	 public ResponseEntity<Ruta> addTroncal(@RequestBody Ruta troncal) {
		rutaRepository.save(troncal);
		 return new ResponseEntity<Ruta>(troncal , HttpStatus.OK);
	 }
}