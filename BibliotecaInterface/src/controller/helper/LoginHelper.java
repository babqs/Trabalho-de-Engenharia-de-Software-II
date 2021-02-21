/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.helper;
import model.Bibliotecario;
import view.Login;
/**
 *
 * @author Uso Exclusivo
 */
public class LoginHelper {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Bibliotecario getModelo(){
        //pegar um usuário da view
        String nome = view.getUsuario().getText();
        String senha = view.getSenha().getText();
        Bibliotecario modelo = new Bibliotecario(0, nome, senha);
        return modelo;
    }
    
    public void setModelo(Bibliotecario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getUsuario().setText(nome);
        view.getSenha().setText(senha);
    }
    
    public void limparTela(){
        view.getUsuario().setText("");
        view.getSenha().setText("");
    }
}
