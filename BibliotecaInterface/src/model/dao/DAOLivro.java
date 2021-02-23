/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import model.Livro;

/**
 *
 * @author Uso Exclusivo
 */
public class DAOLivro {
    
    public void inserir(Livro livro){
       Banco.livro.add(livro);
    }
    
    public boolean atualizar(Livro livro){
        for(int i = 0; i < Banco.livro.size(); i++){
            if(tituloIguais(Banco.livro.get(i),livro)){
                Banco.livro.set(i, livro);
                return true;
            }     
    }
    return false;
}
    
    public boolean deletar(Livro livro){
        for(Livro livros : Banco.livro){
            if(tituloIguais(livros, livro)){
                Banco.livro.remove(livros);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Livro> selecionarTodos(){
        return Banco.livro;
    }
    
    private boolean tituloIguais(Livro livro, Livro comparar) {
        return livro.getTitulo() == comparar.getTitulo();
    }
}
