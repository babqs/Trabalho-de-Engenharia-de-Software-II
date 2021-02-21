/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import model.Bibliotecario;

/**
 *
 * @author Uso Exclusivo
 */
public class DAOBibliotecario {
    
    
    public void inserir(Bibliotecario b){
       Banco.bibliotecario.add(b);
    }
    
    public boolean atualizar(Bibliotecario b){
        for(int i = 0; i < Banco.bibliotecario.size(); i++){
            if(idIguais(Banco.bibliotecario.get(i),b)){
                Banco.bibliotecario.set(i, b);
                return true;
            }     
    }
    return false;
}
    
    public boolean deletar(Bibliotecario b){
        for(Bibliotecario bLista : Banco.bibliotecario){
            if(idIguais(bLista, b)){
                Banco.bibliotecario.remove(bLista);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Bibliotecario> selecionarTodos(){
        return Banco.bibliotecario;
    }
    
    public Bibliotecario selcionarPorNomeESenha(Bibliotecario b){
        for(Bibliotecario bLista : Banco.bibliotecario){
            if(nomeESenhaSaoIguais(bLista,b)){
                return bLista;
            }
        }
        return null;
    }
    
    private boolean nomeESenhaSaoIguais(Bibliotecario b, Bibliotecario bPesquisar){
        return b.getNome().equals(bPesquisar.getNome()) && b.getSenha().equals(bPesquisar.getSenha());
    }
    
    private boolean idIguais(Bibliotecario b, Bibliotecario bComparar){
        return b.getId() == bComparar.getId();
    }

}
