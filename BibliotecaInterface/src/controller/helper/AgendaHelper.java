/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.helper;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Aluno;
import model.Emprestimo;
import model.Livro;
import view.Agenda;

/**
 *
 * @author Uso Exclusivo
 */
public class AgendaHelper implements Helper{
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }
    
    public void tabela(ArrayList<Emprestimo> emprestimos){
        DefaultTableModel tableModel = (DefaultTableModel) view.getTabelaEmprestimos().getModel();
        tableModel.setNumRows(0);
        
        //percorrer a lista preenchendo o table model
        for(Emprestimo emprestimo : emprestimos){
            tableModel.addRow(new Object[]{
                emprestimo.getId(),
                emprestimo.getAluno().getRA(),
                emprestimo.getAluno().getNome(),
                emprestimo.getItem(),
                emprestimo.getDataEmprestimo(),
                emprestimo.getHoraFormatada()
            });
        }
    }

    public void alunos(ArrayList<Aluno> alunos) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxNome().getModel();
        
        for (Aluno aluno : alunos) {
            comboBoxModel.addElement(aluno);
        }    }

    public void livros(ArrayList<Livro> livros) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxLivros().getModel();
        
        for (Livro livro : livros){
            comboBoxModel.addElement(livro);
        }
    }
    
    public Livro getLivro(){
        return (Livro) view.getjComboBoxLivros().getSelectedItem();
    }
    
    public Aluno getAluno(){
        return (Aluno) view.getjComboBoxNome().getSelectedItem();
    }

//    public void setPrazo(Integer prazo) {
//        view.getCampoPrazoLivro().setText(prazo+"");
//    }


    @Override
    public void limparTela() {
        
    }

    @Override
    public Object getModelo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
