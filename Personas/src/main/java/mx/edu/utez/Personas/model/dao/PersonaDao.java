package mx.edu.utez.Personas.model.dao;

import mx.edu.utez.Personas.model.entidad.PersonaBean;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<PersonaBean, Integer> {
}
