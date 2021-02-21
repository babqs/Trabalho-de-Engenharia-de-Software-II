package model;

import java.util.Date;

/**
 *
 * @author Bárbara Quesada Santana
 */
public class Emprestimo {
    protected Date dataEmprestimo;

    public Emprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
}
