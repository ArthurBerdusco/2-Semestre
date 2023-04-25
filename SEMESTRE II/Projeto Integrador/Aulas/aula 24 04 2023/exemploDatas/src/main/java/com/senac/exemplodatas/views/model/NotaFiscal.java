/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.exemplodatas.views.model;

import java.util.Date;

/**
 *
 * @author jsilva91
 */
public class NotaFiscal {
    
    private int idNota;
    private int numeroNota;
    private double valorNota;

    public NotaFiscal() {
    }

    public NotaFiscal(int numeroNota, double valorNota, Date data) {
        this.numeroNota = numeroNota;
        this.valorNota = valorNota;
        this.data = data;
    }

    public NotaFiscal(int idNota, int numeroNota, double valorNota, Date data) {
        this.idNota = idNota;
        this.numeroNota = numeroNota;
        this.valorNota = valorNota;
        this.data = data;
    }
    
    

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public double getValorNota() {
        return valorNota;
    }

    public void setValorNota(double valorNota) {
        this.valorNota = valorNota;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    private Date data;
}
