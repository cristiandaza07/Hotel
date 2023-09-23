package co.edu.tdea.domain.models;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Habitaciones")
public class Habitaciones {
	@Id
	private String id;
	private TipoHabitaciones tipoHabitacion;
	private Estado estado;
	private List<FechaReserva> fechaReservas;
	
}
