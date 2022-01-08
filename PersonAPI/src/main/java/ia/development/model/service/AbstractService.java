package ia.development.model.service;

import ia.development.model.BaseEntity;
import ia.development.model.dto.DTO;
import ia.development.model.mapper.BaseMapper;
import ia.development.model.repository.CustomRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class AbstractService<T extends BaseEntity, D extends DTO<T>> implements Service<T, D> {

	private final BaseMapper<T, D> mapper;

	private final CustomRepository<T> repository;
}
