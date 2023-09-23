package co.edu.tdea.domain.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Fecha_reserva")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FechaReserva {
	@Id
	private String idHabitacion; 
	
	private LocalDate fechaIngreso;
	private LocalDate fechaSalida;
}
