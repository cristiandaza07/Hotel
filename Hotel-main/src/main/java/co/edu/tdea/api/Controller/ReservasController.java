package co.edu.tdea.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.tdea.api.dto.reservas.NuevaReservaDto;
import co.edu.tdea.domain.service.ReservasService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/reservas")
public class ReservasController {

	@Autowired
	private ReservasService reservasService;
	
	@PostMapping
	private ResponseEntity<?> crearReserva(@Valid @RequestBody NuevaReservaDto nuevaReservaDto, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			List<String> errors = bindingResult.getFieldErrors()
					.stream()
					.map(e ->{
						return "El campo " + e.getField() + " dice: "+e.getDefaultMessage();
					}).toList();
			
			return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
		}
		
		try {
			reservasService.guardarReserva(nuevaReservaDto);
		} catch (IllegalArgumentException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>("Exito!",HttpStatus.CREATED);
	}
	
	//@GetMapping
	/*private ResponseEntity<?> findAllCatalogos() {
		try {
		    return new ResponseEntity<>(reservasService.findAll(),HttpStatus.OK);
		} catch (IllegalArgumentException e) {
			return new ResponseEntity<>(new Message(e.getMessage()), HttpStatus.NO_CONTENT);
		}
		
	}*/
}
