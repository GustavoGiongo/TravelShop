package br.com.project.mvc.travelshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.project.mvc.travelshop.model.Demand;

@Repository
public interface DemandRepository extends JpaRepository<Demand, Long>  {
	
	
}
