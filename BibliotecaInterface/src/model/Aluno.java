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
public class Aluno extends Pessoa{
    
    private Integer RA;

    public Aluno(Integer RA, String nome, String CPF, String dataNascimento, String CEP, String endereco) {
        super(nome, CPF, dataNascimento, CEP, endereco);
        this.RA = RA;
    }

    public Aluno(Integer RA, String nome, String CPF, String endereco) {
        super(nome, CPF, endereco);
        this.RA = RA;
    }
     
    public Integer getRA() {
        return RA;
    }

    public void setRA(Integer RA) {
        this.RA = RA;
    }

    @Override
    public String toString() {
        return getNome();
    }
}
