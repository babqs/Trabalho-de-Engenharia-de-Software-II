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
public class Livro extends Titulo{
    private boolean exemplarBiblioteca;
    Titulo titulo;

    public Livro(Integer codigo, String nome) {
        super(codigo, nome);
        this.exemplarBiblioteca = exemplarBiblioteca;
        
        if(codigo == 1){
            exemplarBiblioteca = true;
        }
        else{
            exemplarBiblioteca = false;
        }
    }

    public Livro(Integer codigo, String nome, String isbn, Integer edicao, Integer ano, Integer prazo) {
        super(codigo, nome, isbn, edicao, ano, prazo);
        this.exemplarBiblioteca = exemplarBiblioteca;
        
        if(codigo == 1){
            exemplarBiblioteca = true;
        }
        else{
            exemplarBiblioteca = false;
        }
    }
    
    public boolean isExemplarBiblioteca() {
        return exemplarBiblioteca;
    }

    public void setExemplarBiblioteca(boolean exemplarBiblioteca) {
        this.exemplarBiblioteca = exemplarBiblioteca;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return getNome();
    }
    
    
}
