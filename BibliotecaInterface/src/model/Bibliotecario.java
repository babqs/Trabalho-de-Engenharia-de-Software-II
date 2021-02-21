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
public class Bibliotecario extends Pessoa{
    private Integer id;
    private String senha;

    public Bibliotecario(Integer id, String nome, String senha,  String CPF, String endereco) {
        super(nome, CPF, endereco);
        this.id = id;
        this.senha = senha;
    }

    public Bibliotecario(Integer id, String nome, String senha) {
        super(nome);
        this.id = id;
        this.senha = senha;
    }

    public Bibliotecario(Integer id, String nome, String senha, String CPF, String dataNascimento, String CEP, String endereco) {
        super(nome, CPF, dataNascimento, CEP, endereco);
        this.id = id;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
