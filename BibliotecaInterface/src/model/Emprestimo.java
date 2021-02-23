package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Uso Exclusivo
 */
public class Emprestimo {
    private int id;
    private Date dataEmprestimo;
    private Aluno aluno;
    private Livro livro;
    private ArrayList<ItemEmprestimo> item;
    private String observacao;

    public Emprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    
    public Emprestimo(int id, Aluno aluno, ArrayList<ItemEmprestimo> item, String dataEmprestimo) {
        this.id = id;
        this.aluno = aluno;
        this.item = item;
        //this.dataEmprestimo = dataEmprestimo;
         try {
            this.dataEmprestimo = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(dataEmprestimo);
        } catch (ParseException ex) {
            Logger.getLogger(Emprestimo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getDataEmprestimo() {
         return new SimpleDateFormat("dd/MM/yyyy").format(dataEmprestimo);
    }
    
     public String getHoraFormatada() {
        return new SimpleDateFormat("HH:mm").format(dataEmprestimo);
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public ArrayList<ItemEmprestimo> getItem() {
        return item;
    }

    public void setItem(ArrayList<ItemEmprestimo> item) {
        this.item = item;
    }  

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
}
