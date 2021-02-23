/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import model.Emprestimo;

/**
 *
 * @author Uso Exclusivo
 */
public class DAOAgenda {
    
    public void inserir(Emprestimo emprestimo){
        
        if(emprestimo.getId() == 0){
            emprestimo.setId(nextId());
            Banco.emprestimo.add(emprestimo);
        }
    }
    
    private int nextId(){
        int maior = 0;
        for(Emprestimo emprestimo : Banco.emprestimo){
            int id = emprestimo.getId();
            
            if(maior < id){
                maior = id;
            }
        }
        return maior + 1;
    }
    
    public boolean autalizar(Emprestimo emprestimo){
        for(int i = 0; i < Banco.emprestimo.size(); i++){
            if(idIguais(Banco.emprestimo.get(i), emprestimo)){
                Banco.emprestimo.set(i, emprestimo);
                return true;
            }
        }
        return false;
    }
    
    public boolean cancelar(Emprestimo emprestimo){
        for(Emprestimo emprestimoLista : Banco.emprestimo){
            if(idIguais(emprestimoLista, emprestimo)){
                Banco.emprestimo.remove(emprestimoLista);
                return true;
            }
        }
        return false;
    }
    
    public boolean idIguais(Emprestimo emprestimo, Emprestimo comparar){
        return emprestimo.getId() == comparar.getId();
    }
    
    public ArrayList<Emprestimo> selecionarTudo(){
        return Banco.emprestimo;
    }
    
}