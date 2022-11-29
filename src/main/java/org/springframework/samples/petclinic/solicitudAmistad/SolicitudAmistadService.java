package org.springframework.samples.petclinic.solicitudAmistad;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SolicitudAmistadService {

	
	private SolicitudAmistadRepository solicitudAmistadRepository;

    @Autowired
    public SolicitudAmistadService(SolicitudAmistadRepository solicitudAmistadRepository) {
        this.solicitudAmistadRepository = solicitudAmistadRepository;
    }


    @Transactional(readOnly = true)
    public SolicitudAmistad RequestById(int id) throws DataAccessException {
        return solicitudAmistadRepository.findById(id);
    }
    

    
}
