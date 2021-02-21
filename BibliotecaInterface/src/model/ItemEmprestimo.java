/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Uso Exclusivo
 */
public class ItemEmprestimo extends Emprestimo {
    private Livro livro;
    private Date dataDevolução;

    public ItemEmprestimo(Livro livro, Date dataDevolução, Date dataEmprestimo) {
        super(dataEmprestimo);
        this.livro = livro;
        this.dataDevolução = dataDevolução;
    }

    public ItemEmprestimo(Livro livro, Date dataEmprestimo) {
        super(dataEmprestimo);
        this.livro = livro;
    }
    
    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Date getDataDevolução() {
        return dataDevolução;
    }

    public void setDataDevolução(Date dataDevolução) {
        this.dataDevolução = dataDevolução;
    }
    
}
