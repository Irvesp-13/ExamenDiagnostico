package mx.edu.utez.Personas.model.entidad;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "persona")
public class PersonaBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona", nullable = false)
    private Integer idpersona;

    @Column(name = "nombres", nullable = false)
    private String nombres;

    @Column(name = "apellidos", nullable = false)
    private String apellidos;

    @Column(name = "cumplanios", nullable = false)
    private String cumpleanios;

    @Column(name = "curp", nullable = false)
    private String curp;
}
