package ia.development.model.mapper;

import ia.development.model.BaseEntity;
import ia.development.model.dto.DTO;

public interface BaseMapper<T extends BaseEntity, D extends DTO<T>> {

	T toModel(D dto);

	D toDTO(T dto);
}
