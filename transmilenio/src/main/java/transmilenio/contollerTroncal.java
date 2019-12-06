package transmilenio;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

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
import Bean.Troncal;
import net.bytebuddy.asm.Advice.Return;

@RestController
@Controller
public class contollerTroncal {
	
@Autowired
TroncalRepository troncalRepository;
	
	 @GetMapping("/troncal/consult")
	 public List<Troncal> getAllNotes() {
	     return  (List<Troncal>) troncalRepository.findAll();
	 }
	 
	 @PostMapping("/troncal/Insert")
	 public ResponseEntity<Troncal> addTroncal(@RequestBody Troncal troncal) {
		troncalRepository.save(troncal);
		 return new ResponseEntity<Troncal>( troncal , HttpStatus.OK);
	 }
	 
	 /* @PutMapping("/troncal/{id}")
	 public ResponseEntity<Troncal> updateTroncal(@RequestBody Troncal troncalDetail,@PathVariable String id) {
		 
		 
		/*  {
			  List<Troncal> troncal = (List<Troncal>) troncalRepository.findAll();
			 
			 if (troncal.contains(troncalDetail)  ) {
				 return new ResponseEntity<>(troncalDetail, HttpStatus.OK);
			}else {
				return new ResponseEntity<Troncal>( troncalDetail,HttpStatus.BAD_REQUEST);
			}*/
			 
		}
		 
