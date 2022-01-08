package ia.development.controllers;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import ia.development.model.BaseEntity;
import ia.development.model.dto.DTO;
import ia.development.model.dto.MessageResponseDTO;
import ia.development.model.service.exception.EntityNotFoundException;

public interface RegisterController<T extends BaseEntity, D extends DTO<T>> extends BaseController<T, D> {

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	default MessageResponseDTO create(@RequestBody @Valid D dto) {
		return getService().create(dto);
	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	default MessageResponseDTO update(@PathVariable UUID id, @RequestBody @Valid D dto) throws EntityNotFoundException {
		return getService().update(id, dto);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	default void delete(@PathVariable UUID id) throws EntityNotFoundException {
		getService().delete(id);
	}
}
