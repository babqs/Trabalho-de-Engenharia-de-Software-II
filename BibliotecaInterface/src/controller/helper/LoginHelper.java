  
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
public class LoginHelper implements Helper {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    @Override
    public Bibliotecario getModelo(){
        //pegar um usuário da view
        String nome = view.getCampoUsuario().getText();
        String senha = view.getCampoSenha().getText();
        Bibliotecario modelo = new Bibliotecario(0, nome, senha);
        return modelo;
    }
    
    public void setModelo(Bibliotecario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getCampoUsuario().setText(nome);
        view.getCampoSenha().setText(senha);
    }
    
    public void limparTela(){
        view.getCampoUsuario().setText("");
        view.getCampoSenha().setText("");
    }
}