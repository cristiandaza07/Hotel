package co.edu.tdea.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import co.edu.tdea.domain.models.Reservas;

@EnableJpaRepositories(basePackages = "co.edu.tdea.domain.repository")
public interface ReservasRepository extends CrudRepository<Reservas, String>{
	Optional<Reservas> findByNumDocumentoOrCodigo(String numDocumento, String codigo);
}
