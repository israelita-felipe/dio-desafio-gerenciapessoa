package ia.development.controllers;

import ia.development.model.BaseEntity;
import ia.development.model.dto.DTO;

public interface Controller<T extends BaseEntity, D extends DTO<T>> extends ListController<T,D>, RegisterController<T,D> {

}
