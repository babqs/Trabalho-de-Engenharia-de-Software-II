/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Uso Exclusivo
 */
public class Titulo {
    private Integer prazo;
    private String isbn;
    private Integer edicao;
    private Integer ano;
    private String nome;
    
    public Titulo(Integer codigo, String nome){
        this.prazo = codigo++;
        this.nome = nome;
    }

    public Titulo(Integer codigo, String nome, String isbn, Integer edicao, Integer ano, Integer prazo) {
        this.prazo = codigo++;
        this.isbn = isbn;
        this.edicao = edicao;
        this.ano = ano;
        this.nome = nome;
    }

    public Integer getPrazo() {
        return prazo;
    }

    public void setPrazo(Integer prazo) {
        this.prazo = prazo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getEdicao() {
        return edicao;
    }

    public void setEdicao(Integer edicao) {
        this.edicao = edicao;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
}
