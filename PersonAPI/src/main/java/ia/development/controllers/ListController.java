package ia.development.controllers;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import ia.development.model.BaseEntity;
import ia.development.model.dto.DTO;
import ia.development.model.service.exception.EntityNotFoundException;

public interface ListController<T extends BaseEntity, D extends DTO<T>> extends BaseController<T, D> {

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	default D findById(@PathVariable UUID id) throws EntityNotFoundException {
		return getService().findById(id);
	}

	@GetMapping
	default List<D> listAll(@RequestParam("page") Optional<Integer> page,
			@RequestParam("size") Optional<Integer> size) {
		if (page.isEmpty() || size.isEmpty()) {
			return getService().listAll();
		} else {
			return getService().list(page.get(), size.get());
		}
	}

}
