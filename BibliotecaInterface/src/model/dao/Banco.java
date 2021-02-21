/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import model.Aluno;
import model.Bibliotecario;
import model.Emprestimo;
import model.Livro;

/**
 *
 * @author Uso Exclusivo
 */
public class Banco {

    public static ArrayList<Bibliotecario> bibliotecario;
    public static ArrayList<Aluno> aluno;
    public static ArrayList<Livro> livro;
    public static ArrayList<Emprestimo> emprestimo;


    public static void inicia(){

        //Instancia os Objetos
        bibliotecario = new ArrayList<>();
        aluno = new ArrayList<>();
        livro = new ArrayList<>();
        emprestimo = new ArrayList<>();

        //Integer id, String nome, String senha, String CPF, String dataNascimento, String CEP, String endereco
        Bibliotecario bibliotecario1 = new Bibliotecario(1, "Barbara", "1234", "02356478275", "18/02/1972", "86380000", "Avenida Major Barboza, 564");
//        Bibliotecario bibliotecario2 = new Bibliotecario(2, "Jorge", "5678", "596.789.123-01", "30/07/1989", "86.380-000", "Rua Tapajós, 78");
        
        bibliotecario.add(bibliotecario1);
//        bibliotecario.add(bibliotecario2);
        
        //Integer RA, String nome, String CPF, String dataNascimento, String CEP, String endereco
        Aluno aluno1 = new Aluno(1, "Alan Figueiredo", "30212126", "30/01/1995", "5142487", "Rua jaboti 35 Canudos NH");
//        Aluno aluno2 = new Aluno(2, "Judite Oliveira", "30212127", "30/08/1994", "5142487745", "Rua campo bom 78 Centro NH");
//        Aluno aluno3 = new Aluno(3, "Paulo Ricado", "30212128", "24/04/1997", "78451458", "Rua Tres Irmaos 30 Vila Nova - NH");
//        Aluno aluno4 = new Aluno(4, "Neymar Santos", "30212130", "20/08/1995", "2745487", "Rua Lombardi 40 Canudos NH");
//        Aluno aluno5 = new Aluno(5, "Debruine Pipoqueiro", "30212131", "13/09/1992", "4742487", "Rua pedro quaresma 784 Canudos Belgica");
//        Aluno aluno6 = new Aluno(6, "Matuidi Pareira", "302122324", "17/08/1994", "78512457", "Rua champions 10 Kephas Franca");
//        Aluno aluno7 = new Aluno(7, "Marta de Souza", "302121292", "25/03/1993", "4658237314", "Rua tesla 215 Canudos NH");
//        Aluno aluno8 = new Aluno(8, "Aline Ferrari", "302121451", "04/03/1990", "8475123687", "Rua hyrule 32 Canudos NH");
//        Aluno aluno9 = new Aluno(9, "Samuel Coltinho", "302121189", "09/02/1998", "74595142487", "Rua floresta 12 Canudos NH");
//        Aluno aluno10 = new Aluno(10, "Felipe Luis", "3021212478", "12/06/1999", "845713647", "Rua marechal 1023 Canudos NH");
//        
        aluno.add(aluno1);
//        aluno.add(aluno2);
//        aluno.add(aluno3);
//        aluno.add(aluno4);
//        aluno.add(aluno5);
//        aluno.add(aluno6);
//        aluno.add(aluno7);
//        aluno.add(aluno8);
//        aluno.add(aluno9);
//        aluno.add(aluno10);
          
    }

}
