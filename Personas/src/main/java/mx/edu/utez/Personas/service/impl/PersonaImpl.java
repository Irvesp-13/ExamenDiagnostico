package mx.edu.utez.Personas.service.impl;

import mx.edu.utez.Personas.model.dao.PersonaDao;
import mx.edu.utez.Personas.model.dto.PersonaDto;
import mx.edu.utez.Personas.model.entidad.PersonaBean;
import mx.edu.utez.Personas.service.IPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaImpl implements IPersona {
    @Autowired
    private PersonaDao personaDao;

    @Override
    public PersonaBean save(PersonaDto personaDto) {
        PersonaBean persona = PersonaBean.builder()
                .idpersona(personaDto.getIdpersona())
                .nombres(personaDto.getNombres())
                .apellidos(personaDto.getApellidos())
                .cumpleanios(personaDto.getCumpleanios())
                .curp(personaDto.getCurp())
                .build();
        return personaDao.save(persona);
    }

    @Override
    public PersonaBean findById(Integer id) {
        return personaDao.findById(id).orElse(null);
    }

    @Override
    public List<PersonaBean> findAll() {
        return (List<PersonaBean>) personaDao.findAll();
    }

    @Override
    public void delete(PersonaBean persona) {
        personaDao.delete(persona);

    }
}
