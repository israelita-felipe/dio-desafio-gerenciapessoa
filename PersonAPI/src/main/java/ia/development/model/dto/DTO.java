package ia.development.model.dto;

import java.util.UUID;

import ia.development.model.BaseEntity;

public interface DTO<T extends BaseEntity>  {

	UUID getId();
}
