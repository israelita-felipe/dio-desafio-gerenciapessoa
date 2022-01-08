package ia.development.service;

import org.springframework.stereotype.Service;

import ia.development.model.Person;
import ia.development.model.dto.PersonDTO;
import ia.development.model.mapper.BaseMapper;
import ia.development.repository.CustomRepository;

@Service
public class PersonService extends ia.development.service.AbstractService<Person, PersonDTO> {

	public PersonService(BaseMapper<Person, PersonDTO> mapper, CustomRepository<Person> repository) {
		super(mapper, repository);
	}

}
