package co.edu.tdea.domain.service;

import co.edu.tdea.api.dto.reservas.NuevaReservaDto;
import io.reactivex.rxjava3.core.Completable;

public interface ReservasService {
	Completable guardarReserva(NuevaReservaDto nuevaReservaDto);
}
