package ia.development.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponseDTO {

	public enum Action {
		CREATE, UPDATE;
	}

	private String message;
}
