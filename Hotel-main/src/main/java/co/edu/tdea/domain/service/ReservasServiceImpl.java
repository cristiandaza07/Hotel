package co.edu.tdea.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.tdea.api.dto.reservas.NuevaReservaDto;
import co.edu.tdea.domain.models.Reservas;
import co.edu.tdea.domain.repository.ReservasRepository;
import co.edu.tdea.mappers.ReservasMapper;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Maybe;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ReservasServiceImpl implements ReservasService{
	@Autowired
	private final ReservasRepository reservasRepository;
	@Autowired
	private final ReservasMapper reservasMapper;
	
	@Override
	public Completable guardarReserva(NuevaReservaDto nuevaReservaDto) {
		
		return Maybe.just(reservasRepository.findByNumDocumentoOrCodigo(nuevaReservaDto.getNumDocumento(), nuevaReservaDto.getCodigo()))
				.filter(
						t -> !t.isPresent()
				).map(
					r -> reservasMapper.dtoToEntity(nuevaReservaDto)
				).map(
						r -> reservasRepository.save(r)
				).flatMapCompletable(
						t -> Completable.complete()
				);
	}
	
	
	
}
