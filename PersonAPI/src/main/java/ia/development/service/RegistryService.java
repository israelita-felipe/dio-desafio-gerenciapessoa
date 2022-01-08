package ia.development.service;

import java.util.UUID;

import ia.development.model.BaseEntity;
import ia.development.model.dto.DTO;
import ia.development.model.dto.MessageResponseDTO;
import ia.development.model.dto.MessageResponseDTO.Action;
import ia.development.model.exception.EntityNotFoundException;

public interface RegistryService<T extends BaseEntity, D extends DTO<T>> extends BaseService<T, D> {

	/**
	 * Create a database entity from dto entity and return its message response with
	 * id
	 * 
	 * @param <D>
	 * @param dto
	 * @return message response with the new id
	 */
	default MessageResponseDTO create(D dto) {
		// from dto to database entity
		T toSaveEntity = getMapper().toModel(dto);

		// saved database entity from repository
		T savedEntity = getRepository().save(toSaveEntity);

		// create message response
		return createMessageResponse(savedEntity.getId(), Action.CREATE);
	}

	default MessageResponseDTO update(UUID id, D dto) throws EntityNotFoundException {
		// verify if id is valid
		verifyIfExists(id);

		// from dto to database entity
		T toUpdateEntity = getMapper().toModel(dto);

		// saved database entity from repository
		T savedEntity = getRepository().save(toUpdateEntity);

		// create update message
		return createMessageResponse(savedEntity.getId(), Action.UPDATE);
	}

	default void delete(UUID id) throws EntityNotFoundException {
		// verify if id is valid
		verifyIfExists(id);
		getRepository().deleteById(id);
	}

	default MessageResponseDTO createMessageResponse(UUID id, Action action) {
		switch (action) {
		case CREATE: {
			return MessageResponseDTO.builder().message(String.format("Created with id %s", id.toString())).build();
		}
		case UPDATE: {
			return MessageResponseDTO.builder().message(String.format("Updated with id %s", id.toString())).build();
		}
		default:
			return MessageResponseDTO.builder().message("No action done").build();
		}
	}
}
