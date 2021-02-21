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
public class Livro {
    private boolean exemplarBiblioteca;
    Titulo titulo;

    public Livro(int codigo, String nome){
        titulo = new Titulo(codigo, nome);
    }
    public boolean isExemplarBiblioteca() {
        return exemplarBiblioteca;
    }

    public void setExemplarBiblioteca(boolean exemplarBiblioteca) {
        this.exemplarBiblioteca = exemplarBiblioteca;
    }

    
    public Integer getPrazo(){
        return titulo.getPrazo();
    }

    public Titulo getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + '}';
    }
    
    
}
