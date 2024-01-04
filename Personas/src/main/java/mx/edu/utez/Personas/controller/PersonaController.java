package mx.edu.utez.Personas.controller;

import lombok.AllArgsConstructor;
import mx.edu.utez.Personas.model.dto.PersonaDto;
import mx.edu.utez.Personas.model.entidad.PersonaBean;
import mx.edu.utez.Personas.service.IPersona;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/persona")
public class PersonaController {
    private final IPersona personaService;

    @GetMapping("/")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public List<PersonaBean> getManager() {
        return personaService.findAll();
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public PersonaBean showById(@PathVariable Integer id) {
        return personaService.findById(id);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public void delete(@PathVariable Integer id){
        PersonaBean persona = personaService.findById(id);
        personaService.delete(persona);
    }

    @PostMapping("/")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public PersonaDto create(@RequestBody PersonaDto personaDto){
        PersonaBean personaSave = personaService.save(personaDto);
        return PersonaDto.builder()
                .idpersona(personaSave.getIdpersona())
                .nombres(personaSave.getNombres())
                .apellidos(personaSave.getApellidos())
                .cumpleanios(personaSave.getCumpleanios())
                .curp(personaSave.getCurp())
                .build();
    }

    @PutMapping("/")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public PersonaDto update(@RequestBody PersonaDto personaDto){
        PersonaBean personaUpdate = personaService.save(personaDto);
        return PersonaDto.builder()
                .idpersona(personaDto.getIdpersona())
                .nombres(personaDto.getNombres())
                .apellidos(personaDto.getApellidos())
                .cumpleanios(personaDto.getCumpleanios())
                .curp(personaDto.getCurp())
                .build();
    }
}
