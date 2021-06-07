/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.cursos.Models;

import javax.persistence.*;

@Entity
@Table(name = "CURSOS")
public class Cursos {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private long id;
    
    @Column(name = "nome", length = 50, nullable = false)
    private String nome;
    
    @Column(name = "descricao", length = 255, nullable = true)
    private String descricao;
    
    @Column(name = "ementa", length = 255, nullable = true)
    private String ementa;
    
    @Column(name = "dataCadastro", length = 50, nullable = true)
    private String dataCadastro;
    
    @Column(name = "dataInicio", length = 50, nullable = true)
    private String dataInicio;
    
    private float valor;
    
    @Deprecated
    public Cursos() {
    }
        
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the ementa
     */
    public String getEmenta() {
        return ementa;
    }

    /**
     * @param ementa the ementa to set
     */
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    /**
     * @return the dataCadastro
     */
    public String getDataCadastro() {
        return dataCadastro;
    }

    /**
     * @param dataCadastro the dataCadastro to set
     */
    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    /**
     * @return the dataInicio
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString() {
        return "Curso{" +
                "id=" + this.id +
                ", name='" + this.nome + '\'' +
                ", descricao='" + this.descricao + '\'' +
                ", ementa='" + this.ementa + '\'' +
                ", dataCadastro='" + this.dataCadastro + '\'' +
                ", dataInicio='" + this.dataInicio + '\'' +
                ", valor='" + this.valor + '\'' +
                '}';
    }
}
