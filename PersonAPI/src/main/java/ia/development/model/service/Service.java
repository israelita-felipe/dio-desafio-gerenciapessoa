package ia.development.model.service;

import ia.development.model.BaseEntity;
import ia.development.model.dto.DTO;

public interface Service<T extends BaseEntity, D extends DTO<T>> extends RegistryService<T, D>, ListService<T, D> {

}
