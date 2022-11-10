package com.example.expcond_rest_api.entities;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PERSONAS")
public class person {
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

    public person(Long IDPERSONA, String NOMBRE, String IDENTID, String NOMBRE2, String APELL1, String APELL2, String PADRE, String MADRE, String SEXO, String TIPART, Integer PROV, Integer MUNIC, Date FECHANAC, String PASAPORTE, String TRAMITA) {
        this.IDPERSONA = IDPERSONA;
        this.NOMBRE = NOMBRE;
        this.IDENTID = IDENTID;
        this.NOMBRE2 = NOMBRE2;
        this.APELL1 = APELL1;
        this.APELL2 = APELL2;
        this.PADRE = PADRE;
        this.MADRE = MADRE;
        this.SEXO = SEXO;
        this.TIPART = TIPART;
        this.PROV = PROV;
        this.MUNIC = MUNIC;
        this.FECHANAC = FECHANAC;
        this.PASAPORTE = PASAPORTE;
        this.TRAMITA = TRAMITA;
    }

    public person() {
    }

    public Long getIDPERSONA() {
        return IDPERSONA;
    }

    public void setIDPERSONA(Long IDPERSONA) {
        this.IDPERSONA = IDPERSONA;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getIDENTID() {
        return IDENTID;
    }

    public void setIDENTID(String IDENTID) {
        this.IDENTID = IDENTID;
    }

    public String getNOMBRE2() {
        return NOMBRE2;
    }

    public void setNOMBRE2(String NOMBRE2) {
        this.NOMBRE2 = NOMBRE2;
    }

    public String getAPELL1() {
        return APELL1;
    }

    public void setAPELL1(String APELL1) {
        this.APELL1 = APELL1;
    }

    public String getAPELL2() {
        return APELL2;
    }

    public void setAPELL2(String APELL2) {
        this.APELL2 = APELL2;
    }

    public String getPADRE() {
        return PADRE;
    }

    public void setPADRE(String PADRE) {
        this.PADRE = PADRE;
    }

    public String getMADRE() {
        return MADRE;
    }

    public void setMADRE(String MADRE) {
        this.MADRE = MADRE;
    }

    public String getSEXO() {
        return SEXO;
    }

    public void setSEXO(String SEXO) {
        this.SEXO = SEXO;
    }

    public String getTIPART() {
        return TIPART;
    }

    public void setTIPART(String TIPART) {
        this.TIPART = TIPART;
    }

    public Integer getPROV() {
        return PROV;
    }

    public void setPROV(Integer PROV) {
        this.PROV = PROV;
    }

    public Integer getMUNIC() {
        return MUNIC;
    }

    public void setMUNIC(Integer MUNIC) {
        this.MUNIC = MUNIC;
    }

    public Date getFECHANAC() {
        return FECHANAC;
    }

    public void setFECHANAC(Date FECHANAC) {
        this.FECHANAC = FECHANAC;
    }

    public String getPASAPORTE() {
        return PASAPORTE;
    }

    public void setPASAPORTE(String PASAPORTE) {
        this.PASAPORTE = PASAPORTE;
    }

    public String getTRAMITA() {
        return TRAMITA;
    }

    public void setTRAMITA(String TRAMITA) {
        this.TRAMITA = TRAMITA;
    }

    @Override
    public String toString() {
        return "persons [idPersona=" + IDPERSONA + ", firstName=" + NOMBRE + ", lastName=" + APELL1 + "]";
    }

}
