/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.bean;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Java-LM
 */
public class Vehiculo implements Serializable {

    private Integer placa;
    private String marca;
    private String modelo;
    private Integer año;
    private String n_serie;
    private Integer n_asientos;
    private Integer dias_disponibles;
    private Date disponible_desde;
    private Date disponible_hasta;

    public Integer getPlaca() {
        return placa;
    }

    public void setPlaca(Integer placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public String getN_serie() {
        return n_serie;
    }

    public void setN_serie(String n_serie) {
        this.n_serie = n_serie;
    }

    public Integer getN_asientos() {
        return n_asientos;
    }

    public void setN_asientos(Integer n_asientos) {
        this.n_asientos = n_asientos;
    }

    public Integer getDias_disponibles() {
        return dias_disponibles;
    }

    public void setDias_disponibles(Integer dias_disponibles) {
        this.dias_disponibles = dias_disponibles;
    }

    public Date getDisponible_desde() {
        return disponible_desde;
    }

    public void setDisponible_desde(Date disponible_desde) {
        this.disponible_desde = disponible_desde;
    }

    public Date getDisponible_hasta() {
        return disponible_hasta;
    }

    public void setDisponible_hasta(Date disponible_hasta) {
        this.disponible_hasta = disponible_hasta;
    }
    
    
}
