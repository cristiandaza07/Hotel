package co.edu.tdea.api.dto.reservas;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NuevaReservaDto {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codigo;
	private String idHabitacion;
	private String numDocumento;
	private String nombre;
}
