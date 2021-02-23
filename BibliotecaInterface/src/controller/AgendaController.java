/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.helper.AgendaHelper;
import java.util.ArrayList;
import model.Emprestimo;
import model.dao.DAOALuno;
import model.dao.DAOAgenda;
import view.Agenda;
import model.Aluno;
import model.Livro;
import model.dao.DAOLivro;
/**
 *
 * @author Uso Exclusivo
 */
public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;
    //private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizarAgenda(){
        DAOAgenda agendamentodao  = new DAOAgenda();
        ArrayList<Emprestimo> emprestimos = agendamentodao.selecionarTudo();
        
        helper.tabela(emprestimos);
    }
    
    public void atualizaAluno() {
        
        // busca clientes no BD
        DAOALuno alunodao = new DAOALuno();
        ArrayList<Aluno> alunos = alunodao.selectAll();
        
        // exibir clientes no Combox cliente
       helper.alunos(alunos);
    }
    
    public void atualizaLivros(){
        DAOLivro livrodao = new DAOLivro();
        ArrayList<Livro> livros = livrodao.selecionarTodos();
        
        helper.livros(livros);
    }
//    
//    public void atualizaCodigoLivro(){
//        Livro livro = helper.getLivro();
//        helper.setPrazo(livro.getTitulo().getPrazo());
//    }
    
    public void emprestar(){
        
    }
    
}
