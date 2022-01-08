package ia.development.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import ia.development.model.Person;
import ia.development.model.dto.PersonDTO;

@Mapper(componentModel = "spring")
public interface PersonMapper extends BaseMapper<Person, PersonDTO> {

	@Override
	@Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
	Person toModel(PersonDTO dto);
}
