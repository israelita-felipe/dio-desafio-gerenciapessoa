package ia.development.controllers;

import ia.development.model.BaseEntity;
import ia.development.model.dto.DTO;
import ia.development.service.Service;

public interface BaseController<T extends BaseEntity, D extends DTO<T>> {

	Service<T, D> getService();
}
