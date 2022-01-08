package ia.development.controllers;

import ia.development.model.BaseEntity;
import ia.development.model.dto.DTO;
import ia.development.model.service.Service;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class AbstractController<T extends BaseEntity, D extends DTO<T>> implements Controller<T, D> {

	private final Service<T, D> service;
}
