package ia.development.service;

import java.util.UUID;

import ia.development.model.BaseEntity;
import ia.development.model.dto.DTO;
import ia.development.model.exception.EntityNotFoundException;
import ia.development.model.mapper.BaseMapper;
import ia.development.repository.CustomRepository;

public interface BaseService<T extends BaseEntity, D extends DTO<T>> {

	<R extends CustomRepository<T>> R getRepository();

	<M extends BaseMapper<T, D>> M getMapper();

	default T verifyIfExists(UUID id) throws EntityNotFoundException {
		return getRepository().findById(id).orElseThrow(() -> new EntityNotFoundException(id));
	}
}
