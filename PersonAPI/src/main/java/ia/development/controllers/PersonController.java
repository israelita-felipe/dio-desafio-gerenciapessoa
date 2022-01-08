package ia.development.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ia.development.model.Person;
import ia.development.model.dto.PersonDTO;
import ia.development.service.Service;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController extends AbstractController<Person, PersonDTO> {

	public PersonController(Service<Person, PersonDTO> service) {
		super(service);
	}

}
