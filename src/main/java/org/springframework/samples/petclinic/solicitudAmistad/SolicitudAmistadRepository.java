package org.springframework.samples.petclinic.solicitudAmistad;


import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface SolicitudAmistadRepository extends CrudRepository<SolicitudAmistad,Integer> {

	
	@Query("SELECT SolicitudAmistad FROM SolicitudAmistad SolicitudAmistad WHERE SolicitudAmistad.id =:id")
    public SolicitudAmistad findById(@Param("id") int id);
	
	@Query("SELECT SolicitudAmistad FROM SolicitudAmistad SolicitudAmistad WHERE SolicitudAmistad.JugadorSolicita.user.username =:nombreJugadorSolicita")
    public Collection<SolicitudAmistad> findByNombreJugadorSolicita(@Param("nombreJugadorSolicita") String nombreJugadorSolicita);
	
	@Query("SELECT SolicitudAmistad FROM SolicitudAmistad SolicitudAmistad WHERE SolicitudAmistad.JugadorSolicitado.user.username =:nombreJugadorSolicitado")
    public Collection<SolicitudAmistad> findByNombreJugadorSolicitado(@Param("nombreJugadorSolicitado") String nombreJugadorSolicitado);
	
	
	
	
}
