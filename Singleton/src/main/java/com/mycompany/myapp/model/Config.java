/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.model;

/**
 *
 * @author joaoc
 */
public class Config {
    private static final Config instance = new Config();
    private String formatRelatorios;
    private String tipoGrafico;
    
    private Config(){}
    
    public static Config getInstance(){
        return instance;
    }

    /**
     * @return the formatRelatorios
     */
    public String getFormatRelatorios() {
        return formatRelatorios;
    }

    /**
     * @param formatRelatorios the formatRelatorios to set
     */
    public void setFormatRelatorios(String formatRelatorios) {
        this.formatRelatorios = formatRelatorios;
    }

    /**
     * @return the tipoGrafico
     */
    public String getTipoGrafico() {
        return tipoGrafico;
    }

    /**
     * @param tipoGrafico the tipoGrafico to set
     */
    public void setTipoGrafico(String tipoGrafico) {
        this.tipoGrafico = tipoGrafico;
    }
    
}
