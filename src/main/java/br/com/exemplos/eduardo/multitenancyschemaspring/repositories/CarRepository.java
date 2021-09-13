package br.com.exemplos.eduardo.multitenancyschemaspring.repositories;

import br.com.exemplos.eduardo.multitenancyschemaspring.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
