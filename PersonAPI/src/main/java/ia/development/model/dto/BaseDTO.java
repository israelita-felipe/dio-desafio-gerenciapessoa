package ia.development.model.dto;

import java.util.UUID;

import ia.development.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BaseDTO<T extends BaseEntity> implements DTO<T> {

	private UUID id;
}
