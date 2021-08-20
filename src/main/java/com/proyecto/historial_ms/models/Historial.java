package com.proyecto.historial_ms.models;


import org.springframework.data.annotation.Id;

import java.util.Date;

public class Historial {
    @Id
    private String regNum;
    private String id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String sexo;
    private Integer cuarto;
    private Integer sala;
    private String ocupacion;
    private String motivoConsulta;

    private String cardiovascular;
    private String pulmonar;
    private String digestivo;
    private String diabetes;
    private String renal;
    private String quirurgico;
    private String transfusion;
    private String medicamentos;

    public Historial(String regNum, String id, String nombre, String apellido, Integer edad, String sexo, Integer cuarto, Integer sala, String ocupacion,
                     String motivoConsulta, String cardiovascular, String pulmonar, String digestivo, String diabetes, String renal, String quirurgico, String transfusion, String medicamentos) {
        this.regNum = regNum;
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.cuarto = cuarto;
        this.sala = sala;
        this.ocupacion = ocupacion;
        this.motivoConsulta = motivoConsulta;
        this.cardiovascular = cardiovascular;
        this.pulmonar = pulmonar;
        this.digestivo = digestivo;
        this.diabetes = diabetes;
        this.renal = renal;
        this.quirurgico = quirurgico;
        this.transfusion = transfusion;
        this.medicamentos = medicamentos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getCuarto() {
        return cuarto;
    }

    public void setCuarto(Integer cuarto) {
        this.cuarto = cuarto;
    }

    public Integer get() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getCardiovascular() {
        return cardiovascular;
    }

    public void setCardiovascular(String cardiovascular) {
        this.cardiovascular = cardiovascular;
    }

    public String getPulmonar() {
        return pulmonar;
    }

    public void setPulmonar(String pulmonar) {
        this.pulmonar = pulmonar;
    }

    public String getDigestivo() {
        return digestivo;
    }

    public void setDigestivo(String digestivo) {
        this.digestivo = digestivo;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getRenal() {
        return renal;
    }

    public void setRenal(String renal) {
        this.renal = renal;
    }

    public String getQuirurgico() {
        return quirurgico;
    }

    public void setQuirurgico(String quirurgico) {
        this.quirurgico = quirurgico;
    }

    public String getTransfusion() {
        return transfusion;
    }

    public void setTransfusion(String transfusion) {
        this.transfusion = transfusion;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }
}
