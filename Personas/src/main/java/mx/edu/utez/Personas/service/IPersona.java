package mx.edu.utez.Personas.service;

import mx.edu.utez.Personas.model.dto.PersonaDto;
import mx.edu.utez.Personas.model.entidad.PersonaBean;

import java.util.List;

public interface IPersona {
    PersonaBean save(PersonaDto persona);

    PersonaBean findById(Integer id);

    List<PersonaBean> findAll();
    void delete(PersonaBean persona);
}
