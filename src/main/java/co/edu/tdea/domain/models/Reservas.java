package co.edu.tdea.domain.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "Reservas")
public class Reservas {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codigo;
	
	private String numDocumento;
	private String nombre;
	
	private LocalDate fechaIngreso;
	private LocalDate fechaSalida;
	

}
