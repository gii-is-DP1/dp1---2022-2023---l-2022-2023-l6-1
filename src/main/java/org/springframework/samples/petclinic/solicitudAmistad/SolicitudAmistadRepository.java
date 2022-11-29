package org.springframework.samples.petclinic.solicitudAmistad;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface SolicitudAmistadRepository extends CrudRepository<SolicitudAmistad,Integer> {

	
	@Query("SELECT SolicitudAmistad FROM SolicitudAmistad SolicitudAmistad WHERE SolicitudAmistad.id =:id")
    public SolicitudAmistad findById(@Param("id") int id);
	
	
	
}
