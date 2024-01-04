package mx.edu.utez.Personas.model.dto;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonaDto {
    private Integer idpersona;
    private String nombres;
    private String apellidos;
    private String cumpleanios;
    private String curp;
}
