/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import model.dao.DAOBibliotecario;
import controller.helper.LoginHelper;
import model.Bibliotecario;
import view.Login;
import view.Menu;

/**
 *
 * @author Uso Exclusivo
 */
public class LoginController{

    private final Login view;
    private final LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarSistema(){
        
        //pegar usuario da view
        Bibliotecario bibliotecario = helper.getModelo();
        
        //pesquisar o usuário no banco
        DAOBibliotecario biblioDao = new DAOBibliotecario();
        Bibliotecario bibliotecarioAutenticado = biblioDao.selcionarPorNomeESenha(bibliotecario);
        
        //direcionar para o Menu
        if(bibliotecarioAutenticado != null){
            Menu menu = new Menu();
            menu.setVisible(true);
            view.dispose();
        }//se não usuário ou senha inválidos
        else{
            //System.out.println("Busquei algo no banco");
            this.view.exibeMensagem("Usuário ou senha inválidos!");
        }
        
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo no banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
}
