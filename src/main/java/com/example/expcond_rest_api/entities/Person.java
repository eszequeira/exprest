package com.example.expcond_rest_api.entities;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "PERSONAS")
public class Person {

    @Id
    @Column(name = "ID_PERSONA")
    private Long IDPERSONA;

    private String NOMBRE;
    private String IDENTID;
    private String NOMBRE2;
    private String APELL1;
    private String APELL2;
    private String PADRE;
    private String MADRE;
    private String SEXO;
    private String TIPART;
    private Integer PROV;
    private Integer MUNIC;

    @Column(name = "FECHA_NAC")
    private Date FECHANAC;

    private String PASAPORTE;
    private String TRAMITA;

    @Override
    public String toString() {
        return "persons [idPersona=" + IDPERSONA + ", firstName=" + NOMBRE + ", lastName=" + APELL1 + "]";
    }

}
