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
public class Debito {
	private Integer codigoAluno;

    public Debito(Integer codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public Integer getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(Integer codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

}
