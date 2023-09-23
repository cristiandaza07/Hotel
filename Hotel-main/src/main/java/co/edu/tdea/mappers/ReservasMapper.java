package co.edu.tdea.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

import co.edu.tdea.api.dto.reservas.NuevaReservaDto;
import co.edu.tdea.domain.models.Reservas;

@Mapper(componentModel = ComponentModel.SPRING)
public interface ReservasMapper {
	Reservas dtoToEntity(NuevaReservaDto newRegionalManager);

	
}
